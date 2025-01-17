SUMMARY = "Libhybris backend for GeoClue"
HOMEPAGE = "https://github.com/mer-hybris/geoclue-providers-hybris"
LICENSE = "LGPL-2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "git://github.com/mer-hybris/geoclue-providers-hybris.git;protocol=https"
SRCREV = "8775abcf9983abb4b8be28ad43f7a193edac5605"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

DEPENDS += "geoclue libhybris libconnman-qt5 libqofono qofonoext nemo-qml-plugin-systemsettings"
inherit qmake5

do_install:append() {
    chmod 04755 ${D}/usr/libexec/geoclue-hybris
}

FILES:${PN} += "/usr/share/dbus-1 /usr/share/geoclue-providers"
