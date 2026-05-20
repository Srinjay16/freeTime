## Switches
set_property -dict { PACKAGE_PIN V17 IOSTANDARD LVCMOS33 } [get_ports a]
set_property -dict { PACKAGE_PIN V16 IOSTANDARD LVCMOS33 } [get_ports b]
set_property -dict { PACKAGE_PIN W16 IOSTANDARD LVCMOS33 } [get_ports cin]

## LEDs
set_property -dict { PACKAGE_PIN U16 IOSTANDARD LVCMOS33 } [get_ports s]
set_property -dict { PACKAGE_PIN E19 IOSTANDARD LVCMOS33 } [get_ports cout]

### Buttons
#set_property -dict { PACKAGE_PIN U18 IOSTANDARD LVCMOS33 } [get_ports clk]

## Configuration options, can be used for all designs
set_property CONFIG_VOLTAGE 3.3 [current_design]
set_property CFGBVS VCCO [current_design]

## SPI configuration mode options for QSPI boot, can be used for all designs
set_property BITSTREAM.GENERAL.COMPRESS TRUE [current_design]
set_property BITSTREAM.CONFIG.CONFIGRATE 33 [current_design]
set_property CONFIG_MODE SPIx4 [current_design]