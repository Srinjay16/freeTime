## Clock Signal
set_property PACKAGE_PIN U18 [clk]               ;# 100 MHz Clock (on Basys 3)
set_property IOSTANDARD LVCMOS33 [clk]

## Switch Inputs
set_property PACKAGE_PIN V17 [rst]               ;# SW0 -> Reset input
set_property IOSTANDARD LVCMOS33 [rst]

## LED Outputs for Counter Bits
set_property PACKAGE_PIN U16 [q0]                ;# LED0 -> LSB (q0)
set_property IOSTANDARD LVCMOS33 [q0]

set_property PACKAGE_PIN E19 [q1]                ;# LED1 -> Middle bit (q1)
set_property IOSTANDARD LVCMOS33 [q1]

set_property PACKAGE_PIN U19 [q2]                ;# LED2 -> MSB (q2)
set_property IOSTANDARD LVCMOS33 [q2]

## Bitstream Configuration Properties
set_property BITSTREAM.GENERAL.COMPRESS TRUE [current_design]
set_property BITSTREAM.CONFIG.SPI_BUSWIDTH 4 [current_design]
set_property CONFIG_MODE SPIx4 [current_design]
set_property BITSTREAM.CONFIG.CONFIGRATE 33 [current_design]

## Configuration Voltage Settings
set_property CONFIG_VOLTAGE 3.3 [current_design]
set_property CFGBVS VCCO [current_design]