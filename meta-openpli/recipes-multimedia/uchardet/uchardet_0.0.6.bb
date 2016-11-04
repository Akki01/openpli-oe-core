DESCRIPTION = "uchardet is an encoding detector library, \
which takes a sequence of bytes in an unknown character encoding \
without any additional information, and attempts to determine \
the encoding of the text. Returned encoding names are iconv-compatible."

HOMEPAGE = "https://www.freedesktop.org/wiki/Software/uchardet/"
LICENSE = "MPLv1.1 & GPLv2+ & LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ecda54f6f525388d71d6b3cd92f7474"

# note, currently we use 0.0.6+ version from git, since it contains
# important improvements which are not in 0.0.6. When there
# is 0.0.7 released we should get source from tar package

SRCREV = "119fed7e8dcb7b9e72457ff2b268a61d2264f12d"
SRC_URI = "git://anongit.freedesktop.org/git/uchardet/uchardet.git;protocol=http"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

