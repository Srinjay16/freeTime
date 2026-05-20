`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 12.03.2025 17:00:57
// Design Name: 
// Module Name: full_adder_top
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

module full_adder_top(
    input wire a,
    input wire b,
    input wire cin,
    output wire s,
    output wire cout
    );
    
    assign s = a^b^cin;
    assign cout = (a & cin) | (b & cin) | (a & b);

endmodule
