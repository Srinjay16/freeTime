`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 16.05.2025 23:02:58
// Design Name: 
// Module Name: tb
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////

module tb;
    // Inputs
    reg [3:0] A, B;
    reg Cin;
    // Outputs
    wire [3:0] Sum;
    wire Cout;

    // Instantiate the DUT (Device Under Test)
    cla_4bit_mux dut (
        .A(A),
        .B(B),
        .Cin(Cin),
        .Sum(Sum),
        .Cout(Cout)
    );

    initial begin
        $display("Time\tA\tB\tCin\t\t|\tSum\tCout");
        $display("--------------------------------------------------");

        // Apply a few test cases
        test_case(4'b0000, 4'b0000, 1'b0);
        test_case(4'b0001, 4'b0010, 1'b0);
        test_case(4'b0101, 4'b0011, 1'b0);
        test_case(4'b1111, 4'b0001, 1'b0);
        test_case(4'b1111, 4'b1111, 1'b0);
        test_case(4'b1010, 4'b0101, 1'b1);
        test_case(4'b1001, 4'b0110, 1'b1);
        test_case(4'b1111, 4'b1111, 1'b1);

        $finish;
    end
    // Helper task to apply inputs and wait
    task test_case(input [3:0] a, input [3:0] b, input cin);
        begin
            A = a; B = b; Cin = cin;
            #10;  // wait for 10 time units
            $display("%0t\t%b\t%b\t%b\t|\t%b\t%b", 
                      $time, A, B, Cin, Sum, Cout);
        end
    endtask
endmodule
