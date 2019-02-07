FILESEXTRAPATHS_prepend := "${THISDIR}/util-linux:${COREBASE}/meta/recipes-core/util-linux/util-linux:"

require util-linux.inc

SRC_URI += "file://configure-sbindir.patch \
            file://runuser.pamd \
            file://runuser-l.pamd \
            file://ptest.patch \
            file://run-ptest \
            file://display_testname_for_subtest.patch \
            file://avoid_parallel_tests.patch \
            file://check-for-_HAVE_STRUCT_TERMIOS_C_OSPEED.patch \
"
SRC_URI[md5sum] = "9e5b1b8c1dc99455bdb6b462cf9436d9"
SRC_URI[sha256sum] = "86e6707a379c7ff5489c218cfaf1e3464b0b95acf7817db0bc5f179e356a67b2"

CACHED_CONFIGUREVARS += "scanf_cv_alloc_modifier=ms"

EXTRA_OECONF_class-native = "${SHARED_EXTRA_OECONF} \
			     --disable-use-tty-group \
"
EXTRA_OECONF_class-nativesdk = "${SHARED_EXTRA_OECONF} \
				--disable-use-tty-group \
"
