require wic-image.inc

do_bootimg[depends] += "acpi-upgrades:do_deploy"

IMAGE_INSTALL_append = " switchmode"
