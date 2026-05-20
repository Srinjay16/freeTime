`timescale 1ns/1ps

module tb;
  reg d, clk, rst;
  wire q0, q1, q2, q3;

  // Instantiate the shift register
  shiftReg uut(.d(d), .clk(clk), .rst(rst), .q0(q0), .q1(q1), .q2(q2), .q3(q3));

  // Clock generator: toggles every 5ns
  always #5 clk = ~clk;

  initial begin
    // Initialize signals
    clk = 0;
    rst = 1;
    d = 0;

    // Reset pulse
    #2;  // Give 2ns before reset is active during rising clk
    rst = 1;
    #10;
    rst = 0;

    // Serial input sequence (bit-by-bit)
    #10 d = 1;  // Input 1
    #10 d = 0;  // Input 0
    #10 d = 1;  // Input 1
    #10 d = 1;  // Input 1
    #10 d = 0;  // Extra bits just for fun
    #10 d = 1;

    #30;
    $finish;
  end
endmodule
