## Switches
set_property -dict { PACKAGE_PIN V17 IOSTANDARD LVCMOS33 } [get_ports d]
set_property -dict { PACKAGE_PIN V16 IOSTANDARD LVCMOS33 } [get_ports rst]

## LEDs
set_property -dict { PACKAGE_PIN U16 IOSTANDARD LVCMOS33 } [get_ports q0]
set_property -dict { PACKAGE_PIN E19 IOSTANDARD LVCMOS33 } [get_ports q1]
set_property -dict { PACKAGE_PIN U19 IOSTANDARD LVCMOS33 } [get_ports q2]
set_property -dict { PACKAGE_PIN V19 IOSTANDARD LVCMOS33 } [get_ports q3]

## Buttons
set_property -dict { PACKAGE_PIN U18 IOSTANDARD LVCMOS33 } [get_ports clk]

## Configuration options, can be used for all designs
set_property CONFIG_VOLTAGE 3.3 [current_design]
set_property CFGBVS VCCO [current_design]

## SPI configuration mode options for QSPI boot, can be used for all designs
set_property BITSTREAM.GENERAL.COMPRESS TRUE [current_design]
set_property BITSTREAM.CONFIG.CONFIGRATE 33 [current_design]
set_property CONFIG_MODE SPIx4 [current_design]