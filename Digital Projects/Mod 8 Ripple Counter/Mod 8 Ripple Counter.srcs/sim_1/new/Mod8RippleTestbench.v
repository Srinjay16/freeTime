`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Testbench for Mod-8 Ripple Counter
//////////////////////////////////////////////////////////////////////////////////

module Mod8RippleTestbench;
  reg clk, rst;
  wire q0, q1, q2;

  // Instantiate the Unit Under Test (UUT)
  Mod8RippleCounter uut (
    .clk(clk),
    .rst(rst),
    .q0(q0),
    .q1(q1),
    .q2(q2)
  );

  // Clock generation: 10ns period (toggle every 5ns)
  always #5 clk = ~clk;

  initial begin
    // Initialize
    clk = 0;
    rst = 1;

    // Apply reset for 10ns
    #10 rst = 0;

    // Run simulation for 150ns to observe full cycle
    #150 $finish;
  end
endmodule