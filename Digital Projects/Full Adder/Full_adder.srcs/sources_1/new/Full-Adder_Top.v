`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 12.03.2025 16:55:35
// Design Name: 
// Module Name: Full-Adder_Top
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


module Full-Adder_Top(
    input wire a;
    input wire b;
    input wire cin;
    output wire s;
    output wire cout;
    
    );
    
    assign s= a^b^cin;
    assign cout = a&b | b&cin | cin&a;
endmodule
