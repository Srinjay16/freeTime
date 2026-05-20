`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 12.03.2025 16:59:38
// Design Name: 
// Module Name: full_adder_tb
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


module full_adder_tb;
    reg a, b, cin;
    wire s, cout;
    
    full_adder_top uut(.a(a),.b(b), .cin(cin), .s(s), .cout(cout));
    
    initial begin 
    #2 a=0;b=0;cin=0;
    #2 a=0;b=0;cin=1;
    #2 a=0;b=1;cin=0;
    #2 a=0;b=1;cin=1;
    #2 a=1;b=0;cin=0;
    #2 a=1;b=0;cin=1;
    #2 a=1;b=1;cin=0;
    #2 a=1;b=1;cin=1;
    #2 $finish;
    end
    endmodule

