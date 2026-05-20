`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Mod-8 Ripple Counter using JK Flip-Flops
//////////////////////////////////////////////////////////////////////////////////

// JK Flip-Flop module
module jkff(input j, input k, input clk, input rst, output reg q, output qb);
  always @(posedge clk or posedge rst) begin
    if (rst)
      q <= 1'b0;
    else begin
      case ({j, k})
        2'b00: q <= q;         // No change
        2'b01: q <= 1'b0;      // Reset
        2'b10: q <= 1'b1;      // Set
        2'b11: q <= ~q;        // Toggle
      endcase
    end
  end
  assign qb = ~q;
endmodule

// Mod-8 Ripple Counter (3-bit binary counter)
module Mod8RippleCounter(input clk, input rst, output wire q0, output wire q1, output wire q2);
  wire q0_int, q1_int, q2_int;
  wire qb0, qb1, qb2;

  // All JKs set to toggle mode (J=1, K=1)
  jkff ff0(.j(1'b1), .k(1'b1), .clk(clk),    .rst(rst), .q(q0_int), .qb(qb0));
  jkff ff1(.j(1'b1), .k(1'b1), .clk(q0_int), .rst(rst), .q(q1_int), .qb(qb1));
  jkff ff2(.j(1'b1), .k(1'b1), .clk(q1_int), .rst(rst), .q(q2_int), .qb(qb2));

  // Output assignments
  assign q0 = q0_int;
  assign q1 = q1_int;
  assign q2 = q2_int;
endmodule