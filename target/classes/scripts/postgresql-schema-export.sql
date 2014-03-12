
    drop table stuftax_21 cascade;

    drop table stuftax_22 cascade;

    drop table stuftax_23 cascade;

    drop table stuftax_24 cascade;

    drop table stuftax_25 cascade;

    drop table stuftax_30 cascade;

    drop table stuftax_31 cascade;

    drop table stuftax_35 cascade;

    drop table stuftax_40 cascade;

    drop table stuftax_41 cascade;

    drop table stuftax_51 cascade;

    drop table stuftax_52 cascade;

    drop table stuftax_53 cascade;

    drop table stuftax_54 cascade;

    drop table stuftax_60 cascade;

    drop table stuftax_80 cascade;

    drop table stuftax_91 cascade;

    drop table stuftax_92 cascade;

    drop table stuftax_voorloop cascade;

    drop table stuftax_woz_object cascade;

    create table stuftax_21 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_22 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_23 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_24 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_25 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_30 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_31 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_35 (
        id int8 not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_40 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_41 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_51 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_52 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_53 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_54 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_60 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_80 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_91 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_92 (
        id  bigserial not null,
        line_number int4,
        primary key (id)
    );

    create table stuftax_voorloop (
        id  bigserial not null,
        aanmaak_datum_bestand timestamp,
        aard_levering_bestand varchar(255),
        bijgewerkt_tm_maand int4,
        contactpersoon varchar(255),
        cp_telefoonnummer varchar(255),
        datum_vorige_aanl_bestand timestamp,
        gemeente_code int4,
        gemeente_naam varchar(255),
        line_number int4,
        software_leverancier varchar(255),
        versie_stuftax int4,
        primary key (id)
    );

    create table stuftax_woz_object (
        id  bigserial not null,
        aandeel_getaxeerde_waarde_geb int4,
        aand_huisnummer varchar(255),
        aand_valutasoort varchar(255),
        bijz_waarderings_code int4,
        code_blokkeren_taxatie int4,
        code_geb_ongeb varchar(255),
        einddatum timestamp,
        gebruikscode int4,
        grondoppervlakte int4,
        huisletter varchar(255),
        huisnummer int4,
        huisnummer_toev varchar(255),
        ingangsdatum timestamp,
        line_number int4,
        lokatieomschrijving varchar(255),
        meegetaxeerde_opp_geb int4,
        mutatiecode varchar(255),
        postcode varchar(255),
        straatcode int4,
        straatnaam varchar(255),
        vastgestelde_waarde int4,
        waarde_peildatum timestamp,
        woonplaats varchar(255),
        woz_objectnummer int8,
        primary key (id)
    );
