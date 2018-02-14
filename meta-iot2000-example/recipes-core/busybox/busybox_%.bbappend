do_install_append() {
   install -d ${D}${sysconfdir}/rcS.d
   install -d ${D}${sysconfdir}/rc0.d
   install -d ${D}${sysconfdir}/rc6.d
   ln -s ../init.d/syslog ${D}${sysconfdir}/rcS.d/S02syslog
   ln -s ../init.d/syslog ${D}${sysconfdir}/rc0.d/K98syslog
   ln -s ../init.d/syslog ${D}${sysconfdir}/rc6.d/K98syslog
}
