package de.dogcraft.ssltest.dns;

import de.dogcraft.ssltest.dns.rr.RR;

public enum RRType {
    UNKNOWN(0, true),

    A(1, de.dogcraft.ssltest.dns.rr.A.class),
    NS(2),
    MD(3),
    MF(4),
    CNAME(5),
    SOA(6),
    MB(7),
    MG(8),
    MR(9),
    NULL(10),
    WKS(11),
    PTR(12),
    HINFO(13),
    MINFO(14),
    MX(15),
    TXT(16),
    RP(17),
    AFSDB(18),
    X25(19),
    ISDN(20),
    RT(21),
    NSAP(22),
    NSAPPTR(23), // Actually NSAP-PTR
    SIG(24),
    KEY(25),
    PX(26),
    GPOS(27),
    AAAA(28),
    LOC(29),
    NXT(30),
    EID(31),
    NIMLOC(32),
    SRV(33),
    ATMA(34),
    NAPTR(35),
    KX(36),
    CERT(37),
    A6(38),
    DNAME(39),
    SINK(40),
    APL(42),
    DS(43),
    SSHFP(44),
    IPSECKEY(45),
    RRSIG(46),
    NSEC(47),
    DNSKEY(48),
    DHCID(49),
    NSEC3(50),
    NSEC3PARAM(51),
    TLSA(52),
    HIP(55),
    NINFO(56),
    RKEY(57),
    TALINK(58),
    CDS(59),
    CDNSKEy(60),
    OPENPGPKEY(61),
    CSYNC(62),

    SPF(99),
    UINFO(100),
    UID(101),
    GID(102),
    UNSPEC(103),
    NID(104),
    L32(105),
    L64(106),
    LP(107),
    EUI48(108),
    EUI64(109),

    TKEY(249),
    TSIG(250),
    URI(256),
    CAA(257),

    TA(32768),
    DLV(32769),

    OPT(41, true),
    IXFR(251, true),
    AXFR(252, true),
    MAILB(253, true),
    MAILA(254, true),
    ANY(255, true);

    public final int id;

    public final boolean qtype;

    public final Class<? extends RR> rrclass;

    private RRType(int id) {
        this(id, RR.class, false);
    }

    private RRType(int id, boolean qtype) {
        this(id, RR.class, qtype);
    }

    private RRType(int id, Class<? extends RR> rrclass) {
        this(id, rrclass, false);
    }

    private RRType(int id, Class<? extends RR> rrclass, boolean qtype) {
        this.id = id;
        this.qtype = true;
        this.rrclass = rrclass;
    }

}