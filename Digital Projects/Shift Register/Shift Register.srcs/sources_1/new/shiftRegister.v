`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Engineer: Srinjay 😉
// 
// Create Date: 17.03.2025
// Module Name: shiftRegister
// Description: 4-bit Serial-In Parallel-Out (SIPO) Shift Register
//////////////////////////////////////////////////////////////////////////////////

// Single D Flip-Flop with async reset
module dFF(input d, clk, rst, output reg q);
  always @(posedge clk or posedge rst) begin
    if (rst)
      q <= 1'b0;
    else
      q <= d;
  end
endmodule

// 4-bit SIPO Shift Register
module shiftReg(input d, clk, rst, output q3, q2, q1, q0);
  wire w0, w1, w2;

  // Instantiating the shift chain
  dFF dff0(.d(d),   .clk(clk), .rst(rst), .q(w0));
  dFF dff1(.d(w0),  .clk(clk), .rst(rst), .q(w1));
  dFF dff2(.d(w1),  .clk(clk), .rst(rst), .q(w2));
  dFF dff3(.d(w2),  .clk(clk), .rst(rst), .q(q3));  // MSB output

  // Parallel outputs
  assign q0 = w0;
  assign q1 = w1;
  assign q2 = w2;
  // q3 is already assigned from dff3
endmodule