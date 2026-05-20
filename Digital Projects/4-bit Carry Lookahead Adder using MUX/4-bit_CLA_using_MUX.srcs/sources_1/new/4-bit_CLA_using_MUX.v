`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 16.05.2025 23:00:09
// Design Name: 
// Module Name: 4-bit_CLA_using_MUX
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
module mux2to1(input sel, input d0, input d1, output out);
    assign out = sel ? d1 : d0;
endmodule

module mux_and(input a, input b, output out);
    mux2to1 m1(.sel(a), .d0(1'b0), .d1(b), .out(out));
endmodule

module mux_or(input a, input b, output out);
    mux2to1 m1(.sel(a), .d0(b), .d1(1'b1), .out(out));
endmodule

module mux_xor(input a, input b, output out);
    wire b_not;
    assign b_not = ~b;
    mux2to1 m1(.sel(a), .d0(b_not), .d1(b), .out(out));
endmodule

module cla_4bit_mux (
    input [3:0] A, B,
    input Cin,
    output [3:0] Sum,
    output Cout
);
    wire [3:0] G, P, C;

    // Generate G and P
    mux_and g0 (.a(A[0]), .b(B[0]), .out(G[0]));
    mux_and g1 (.a(A[1]), .b(B[1]), .out(G[1]));
    mux_and g2 (.a(A[2]), .b(B[2]), .out(G[2]));
    mux_and g3 (.a(A[3]), .b(B[3]), .out(G[3]));

    mux_xor p0 (.a(A[0]), .b(B[0]), .out(P[0]));
    mux_xor p1 (.a(A[1]), .b(B[1]), .out(P[1]));
    mux_xor p2 (.a(A[2]), .b(B[2]), .out(P[2]));
    mux_xor p3 (.a(A[3]), .b(B[3]), .out(P[3]));

    // Carry bits
    assign C[0] = Cin;

    wire P0C0, P1C1, P2C2, P3C3;
    wire P1G0, P2G1, P2P1G0, P3G2, P3P2G1, P3P2P1G0;
    wire P0P1, P0P1P2, P0P1P2P3;

    mux_and andP0C0 (.a(P[0]), .b(C[0]), .out(P0C0));
    mux_or  orC1   (.a(G[0]), .b(P0C0), .out(C[1]));

    mux_and andP1G0 (.a(P[1]), .b(G[0]), .out(P1G0));
    mux_and andP0P1 (.a(P[1]), .b(P[0]), .out(P0P1));
    mux_and andP1P0C0 (.a(P0P1), .b(C[0]), .out(P1C1));
    wire G1or = G[1] | P1G0;
    assign C[2] = G1or | P1C1;

    mux_and andP2G1 (.a(P[2]), .b(G[1]), .out(P2G1));
    mux_and andP2P1 (.a(P[2]), .b(P[1]), .out(P2P1));
    mux_and andP2P1G0 (.a(P2P1), .b(G[0]), .out(P2P1G0));
    mux_and andP2P1P0 (.a(P2P1), .b(P[0]), .out(P0P1P2));
    mux_and andP2P1P0C0 (.a(P0P1P2), .b(C[0]), .out(P2C2));
    wire G2or = G[2] | P2G1 | P2P1G0;
    assign C[3] = G2or | P2C2;

    // Cout
    mux_and andP3G2 (.a(P[3]), .b(G[2]), .out(P3G2));
    mux_and andP3P2 (.a(P[3]), .b(P[2]), .out(P3P2));
    mux_and andP3P2G1 (.a(P3P2), .b(G[1]), .out(P3P2G1));
    mux_and andP3P2P1 (.a(P3P2), .b(P[1]), .out(P3P2P1));
    mux_and andP3P2P1G0 (.a(P3P2P1), .b(G[0]), .out(P3P2P1G0));
    mux_and andP3P2P1P0 (.a(P3P2P1), .b(P[0]), .out(P0P1P2P3));
    mux_and andP3P2P1P0C0 (.a(P0P1P2P3), .b(C[0]), .out(P3C3));

    assign Cout = G[3] | P3G2 | P3P2G1 | P3P2P1G0 | P3C3;

    // Sum = P ^ Carry
    mux_xor s0 (.a(P[0]), .b(C[0]), .out(Sum[0]));
    mux_xor s1 (.a(P[1]), .b(C[1]), .out(Sum[1]));
    mux_xor s2 (.a(P[2]), .b(C[2]), .out(Sum[2]));
    mux_xor s3 (.a(P[3]), .b(C[3]), .out(Sum[3]));
endmodule