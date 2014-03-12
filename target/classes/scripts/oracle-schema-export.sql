
    drop table stuftax_21 cascade constraints;

    drop table stuftax_22 cascade constraints;

    drop table stuftax_23 cascade constraints;

    drop table stuftax_24 cascade constraints;

    drop table stuftax_25 cascade constraints;

    drop table stuftax_30 cascade constraints;

    drop table stuftax_31 cascade constraints;

    drop table stuftax_35 cascade constraints;

    drop table stuftax_40 cascade constraints;

    drop table stuftax_41 cascade constraints;

    drop table stuftax_51 cascade constraints;

    drop table stuftax_52 cascade constraints;

    drop table stuftax_53 cascade constraints;

    drop table stuftax_54 cascade constraints;

    drop table stuftax_60 cascade constraints;

    drop table stuftax_80 cascade constraints;

    drop table stuftax_91 cascade constraints;

    drop table stuftax_92 cascade constraints;

    drop table stuftax_voorloop cascade constraints;

    drop table stuftax_woz_object cascade constraints;

    drop sequence stuftax_00_id_seq;

    drop sequence stuftax_20_id_seq;

    drop sequence stuftax_21_id_seq;

    drop sequence stuftax_22_id_seq;

    drop sequence stuftax_23_id_seq;

    drop sequence stuftax_24_id_seq;

    drop sequence stuftax_25_id_seq;

    drop sequence stuftax_30_id_seq;

    drop sequence stuftax_31_id_seq;

    drop sequence stuftax_40_id_seq;

    drop sequence stuftax_41_id_seq;

    drop sequence stuftax_51_id_seq;

    drop sequence stuftax_52_id_seq;

    drop sequence stuftax_53_id_seq;

    drop sequence stuftax_54_id_seq;

    drop sequence stuftax_60_id_seq;

    drop sequence stuftax_80_id_seq;

    drop sequence stuftax_91_id_seq;

    drop sequence stuftax_92_id_seq;

    create table stuftax_21 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_22 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_23 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_24 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_25 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_30 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_31 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_35 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_40 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_41 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_51 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_52 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_53 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_54 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_60 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_80 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_91 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_92 (
        id number(19,0) not null,
        line_number number(10,0),
        primary key (id)
    );

    create table stuftax_voorloop (
        id number(19,0) not null,
        aanmaak_datum_bestand timestamp,
        aard_levering_bestand varchar2(255 char),
        bijgewerkt_tm_maand number(10,0),
        contactpersoon varchar2(255 char),
        cp_telefoonnummer varchar2(255 char),
        datum_vorige_aanl_bestand timestamp,
        gemeente_code number(10,0),
        gemeente_naam varchar2(255 char),
        line_number number(10,0),
        software_leverancier varchar2(255 char),
        versie_stuftax number(10,0),
        primary key (id)
    );

    create table stuftax_woz_object (
        id number(19,0) not null,
        aandeel_getaxeerde_waarde_geb number(10,0),
        aand_huisnummer varchar2(255 char),
        aand_valutasoort varchar2(255 char),
        bijz_waarderings_code number(10,0),
        code_blokkeren_taxatie number(10,0),
        code_geb_ongeb varchar2(255 char),
        einddatum timestamp,
        gebruikscode number(10,0),
        grondoppervlakte number(10,0),
        huisletter varchar2(255 char),
        huisnummer number(10,0),
        huisnummer_toev varchar2(255 char),
        ingangsdatum timestamp,
        line_number number(10,0),
        lokatieomschrijving varchar2(255 char),
        meegetaxeerde_opp_geb number(10,0),
        mutatiecode varchar2(255 char),
        postcode varchar2(255 char),
        straatcode number(10,0),
        straatnaam varchar2(255 char),
        vastgestelde_waarde number(10,0),
        waarde_peildatum timestamp,
        woonplaats varchar2(255 char),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create sequence stuftax_00_id_seq;

    create sequence stuftax_20_id_seq;

    create sequence stuftax_21_id_seq;

    create sequence stuftax_22_id_seq;

    create sequence stuftax_23_id_seq;

    create sequence stuftax_24_id_seq;

    create sequence stuftax_25_id_seq;

    create sequence stuftax_30_id_seq;

    create sequence stuftax_31_id_seq;

    create sequence stuftax_40_id_seq;

    create sequence stuftax_41_id_seq;

    create sequence stuftax_51_id_seq;

    create sequence stuftax_52_id_seq;

    create sequence stuftax_53_id_seq;

    create sequence stuftax_54_id_seq;

    create sequence stuftax_60_id_seq;

    create sequence stuftax_80_id_seq;

    create sequence stuftax_91_id_seq;

    create sequence stuftax_92_id_seq;
