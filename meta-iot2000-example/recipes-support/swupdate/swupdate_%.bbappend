FILESEXTRAPATHS_prepend := "${THISDIR}/swupdate:"

SRCREV = "94e840b4fbf5de202ab30f763194593e18e6181f"

SRC_URI = "\
          git://github.com/siemens/swupdate.git;protocol=https;branch=next \
          file://defconfig \
          "
