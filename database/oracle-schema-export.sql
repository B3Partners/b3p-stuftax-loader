
    drop table stuftax_00 cascade constraints;

    drop table stuftax_20 cascade constraints;

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

    drop table stuftax_totalen cascade constraints;

    drop sequence stuftax_00_id_seq;

    drop sequence stuftax_20_id_seq;

    drop sequence stuftax_21_id_seq;

    drop sequence stuftax_22_id_seq;

    drop sequence stuftax_23_id_seq;

    drop sequence stuftax_24_id_seq;

    drop sequence stuftax_25_id_seq;

    drop sequence stuftax_30_id_seq;

    drop sequence stuftax_31_id_seq;

    drop sequence stuftax_35_id_seq;

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

    drop sequence stuftax_totalen_id_seq;

    create table stuftax_00 (
        id number(19,0) not null,
        aanmaak_datum_bestand timestamp,
        aard_levering_bestand varchar2(255 char),
        bijgewerkt_tm_maand number(10,0),
        contactpersoon varchar2(255 char),
        cp_telefoonnummer varchar2(255 char),
        datum_vorig_aanl_bestand timestamp,
        gemeente_code number(10,0),
        gemeente_naam varchar2(255 char),
        line_number number(10,0),
        software_leverancier varchar2(255 char),
        versie_stuftax number(10,0),
        primary key (id)
    );

    create table stuftax_20 (
        id number(19,0) not null,
        aandeel_getaxeerd_waarde_geb number(10,0),
        aand_huisnummer varchar2(255 char),
        aand_valutasoort varchar2(255 char),
        bijz_waardering_code number(10,0),
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
        vastgesteld_waarde number(10,0),
        waarde_peildatum timestamp,
        woonplaats varchar2(255 char),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_21 (
        id number(19,0) not null,
        aantekening varchar2(255 char),
        aanwezig_lift varchar2(255 char),
        buurtcode number(10,0),
        code_omzetbelasting varchar2(255 char),
        code_ontbreken_nuts varchar2(255 char),
        einddatum timestamp,
        financieringvorm varchar2(255 char),
        foto_indexnummer number(10,0),
        waarderingvoorschrift varchar2(255 char),
        getaxeerd_waarde number(10,0),
        aand_groep_vergelijkb_object varchar2(255 char),
        heffing_maatstaf_onr_gebr number(10,0),
        indicatie_ligging varchar2(255 char),
        ingangsdatum timestamp,
        inpandige_opname varchar2(255 char),
        line_number number(10,0),
        aand_monument varchar2(255 char),
        mutatiecode varchar2(255 char),
        percentage_gereed number(10,0),
        reden_waardeverschil_vast_onr varchar2(255 char),
        soort_object_code varchar2(255 char),
        stijlletter varchar2(255 char),
        taxateur varchar2(255 char),
        taxatiedatum timestamp,
        toestand_peildatum timestamp,
        type_aanduiding varchar2(255 char),
        waarde_onr_zaakbelasting number(10,0),
        wijkcode number(10,0),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_22 (
        id number(19,0) not null,
        aantal_kamers number(10,0),
        aantal_stuk_eenheden number(10,0),
        aantekening_onderdeel varchar2(255 char),
        bepaald_waarde_onderdeel number(10,0),
        bouwjaar varchar2(255 char),
        bouwlaag number(10,0),
        breedte number(10,0),
        code_bruto_netto_inhoud varchar2(255 char),
        code_bruto_netto_oppervlakte varchar2(255 char),
        code_omzetbelasting varchar2(255 char),
        code_onderdeel_wozobject varchar2(255 char),
        code_taxatie_methode varchar2(255 char),
        code_vrijstelling_ozb varchar2(255 char),
        doelmatigheid varchar2(255 char),
        einddatum timestamp,
        factor_func_veroudering number(10,0),
        factor_techn_veroudering number(10,0),
        foto_indexnummer number(10,0),
        front_breedte number(10,0),
        waarderingvoorschrift varchar2(255 char),
        aand_groep_vergelijkb_object varchar2(255 char),
        hoogte number(10,0),
        huurwaarde number(10,0),
        huurwaarde_per_m2 number(10,0),
        ingangsdatum timestamp,
        inhoud number(10,0),
        invloed_doelmatigheid number(10,0),
        invloed_eco_veroudering number(10,0),
        invloed_excess_gebruikkost number(10,0),
        invloed_bouwwijze_verandering number(10,0),
        kapitalisatiefactor number(10,0),
        kwaliteit_luxe varchar2(255 char),
        lengte number(10,0),
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        nummer_onderdeel number(10,0),
        onderhoudtoestand varchar2(255 char),
        ongecorrigeerd_vervangwaarde number(10,0),
        ontsluiting_verdieping varchar2(255 char),
        oppervlakte number(10,0),
        jaar_renovatie number(10,0),
        percentage_renovatie number(10,0),
        restwaarde number(10,0),
        uitstraling varchar2(255 char),
        kosten_vervanging_m3_stuk number(10,0),
        verwachte_levensduur number(10,0),
        voorzieningen varchar2(255 char),
        waarde_per_stuk_eenheid number(10,0),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_23 (
        id number(19,0) not null,
        einddatum timestamp,
        aand_groep_vergelijkb_obj varchar2(255 char),
        indic_vermelding_taxatieversl varchar2(255 char),
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        volgnummer_marktgegeven number(10,0),
        woz_objectnummer_ref number(19,0),
        primary key (id)
    );

    create table stuftax_24 (
        id number(19,0) not null,
        aand_valutasoort varchar2(255 char),
        einddatum timestamp,
        gemachtigde varchar2(255 char),
        indiener_bezwaarschrift varchar2(255 char),
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        nummer_bezwaarschrift varchar2(255 char),
        nummer_bouwvergunning varchar2(255 char),
        omschrijving_vergunning varchar2(255 char),
        opgegeven_kosten_verbouwing number(19,0),
        reden_tussentijd_taxatie varchar2(255 char),
        resultaat_tussentijd_taxatie varchar2(255 char),
        valutakosten_verbouwing varchar2(255 char),
        volgnummer_tussentijd_taxatie number(10,0),
        waarde_peildatum timestamp,
        waardeverandering_mutatie number(10,0),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_25 (
        id number(19,0) not null,
        aantekening varchar2(255 char),
        datum_controle timestamp,
        einddatum timestamp,
        gecontroleerd_object_kenm number(10,0),
        gecontroleerd_onderdelen number(10,0),
        identific_uitvoerder varchar2(255 char),
        ingangsdatum timestamp,
        line_number number(10,0),
        methodiek_controle number(10,0),
        mutatiecode varchar2(255 char),
        reden_controle number(10,0),
        taxateur varchar2(255 char),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_30 (
        id number(19,0) not null,
        anummer_nat_persoon number(19,0),
        aand_naamgebruik varchar2(255 char),
        aanvulling_sofinummer number(10,0),
        geslacht_bedrijfnaam varchar2(255 char),
        line_number number(10,0),
        partner_bedrijfnaam_verkort varchar2(255 char),
        sofinummer number(19,0),
        voorletters varchar2(255 char),
        voorvoegsels varchar2(255 char),
        voorvoegsel_partner varchar2(255 char),
        primary key (id)
    );

    create table stuftax_31 (
        id number(19,0) not null,
        aand_huisnummer varchar2(255 char),
        aanvulling_sofinummer number(19,0),
        adelijke_titel_predikaat varchar2(255 char),
        einddatum timestamp,
        functie_adres varchar2(255 char),
        geb_datum_nat_persoon timestamp,
        geslacht varchar2(255 char),
        handelsregisternummer number(19,0),
        huisletter varchar2(255 char),
        huisnummer number(10,0),
        huisnummer_toev varchar2(255 char),
        ingangsdatum timestamp,
        land varchar2(255 char),
        line_number number(10,0),
        lokatieomschrijving varchar2(255 char),
        mutatiecode varchar2(255 char),
        overlijden_datum_nat_persoon timestamp,
        postcode varchar2(255 char),
        sofinummer number(19,0),
        status_subject varchar2(255 char),
        straatnaam varchar2(255 char),
        subjectnummer_akr number(19,0),
        woonplaats varchar2(255 char),
        primary key (id)
    );

    create table stuftax_35 (
        id number(19,0) not null,
        aand_huisnummer varchar2(255 char),
        einddatum timestamp,
        huisletter varchar2(255 char),
        huisnummer number(10,0),
        huisnummer_toev varchar2(255 char),
        ingangsdatum timestamp,
        line_number number(10,0),
        lokatieomschrijving varchar2(255 char),
        mutatiecode varchar2(255 char),
        postcode varchar2(255 char),
        straatnaam varchar2(255 char),
        straatcode number(10,0),
        woonplaats varchar2(255 char),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_40 (
        id number(19,0) not null,
        einddatum timestamp,
        ingangsdatum timestamp,
        kad_gemeente_code varchar2(255 char),
        line_number number(10,0),
        meegetaxeerd_opp_geb number(10,0),
        mutatiecode varchar2(255 char),
        perceel_indexletter varchar2(255 char),
        perceel_indexnummer number(10,0),
        perceelnummer number(10,0),
        sectie varchar2(255 char),
        toegekend_oppervlakte number(10,0),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_41 (
        id number(19,0) not null,
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        woz_objectnummer number(19,0),
        woz_objectnummer_sluimer number(19,0),
        primary key (id)
    );

    create table stuftax_51 (
        id number(19,0) not null,
        bebouwingcode number(10,0),
        einddatum timestamp,
        ingangsdatum timestamp,
        kaartblad_nummer number(10,0),
        kaartblad_volgnummer number(10,0),
        kad_gemeente_code varchar2(255 char),
        kadaster_oppervlakte number(10,0),
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        perceel_indexletter varchar2(255 char),
        perceel_indexnummer number(10,0),
        perceelnummer number(10,0),
        registercode varchar2(255 char),
        ruitletter varchar2(255 char),
        ruitnummer number(10,0),
        sectie varchar2(255 char),
        stuknummer varchar2(255 char),
        x_coord number(10,0),
        y_coord number(10,0),
        primary key (id)
    );

    create table stuftax_52 (
        id number(19,0) not null,
        aand_bruikb_marktgegeven varchar2(255 char),
        aand_valutasoort varchar2(255 char),
        aard_marktinfo varchar2(255 char),
        datum_transactie timestamp,
        einddatum timestamp,
        geschat_huurprijs_m2_peildatum number(10,0),
        grondkosten number(10,0),
        gronduitgifteprijs_m2 number(10,0),
        huurprijs_m2_primair number(10,0),
        indexatie_huurpijs varchar2(255 char),
        indic_omzetbel_grondprijs varchar2(255 char),
        indic_omzetbel_huurprijs varchar2(255 char),
        ingangsdatum timestamp,
        kosten_afbouw_inr number(10,0),
        kosten_infra number(10,0),
        kosten_installatie number(10,0),
        kosten_overig number(10,0),
        kosten_ruwbouw number(10,0),
        kosten_werktuigen number(10,0),
        line_number number(10,0),
        looptijd_huurcontract number(10,0),
        mutatiecode varchar2(255 char),
        omschrijving_transactie varchar2(255 char),
        servicekosten number(10,0),
        soort_transactie varchar2(255 char),
        totaal_brutoinhoud_obj number(10,0),
        totaal_bruto_vloer_opp number(10,0),
        totaal_opp_grond number(10,0),
        txprijs number(10,0),
        txprijs_idx_waarde_peildatum number(10,0),
        verhuurb_vloer_opp_primair number(10,0),
        volgnummer_marktgegeven number(10,0),
        primary key (id)
    );

    create table stuftax_53 (
        id number(19,0) not null,
        einddatum timestamp,
        foto_indexnummer number(10,0),
        ingangsdatum timestamp,
        koopdatum timestamp,
        kwant_fout_oude_waarde number(10,0),
        kwant_gevolg_wijz_wozobject number(10,0),
        kwant_verschil_verkprijs_markt number(10,0),
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        reden_afwijk_marktgeg_wozverw number(10,0),
        relevantie_afwijking number(10,0),
        waarde_vastgest_datum_marktg number(19,0),
        wijz_verw_waarde_vastgesteld number(10,0),
        volgnummer_marktgegeven number(10,0),
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_54 (
        id number(19,0) not null,
        einddatum timestamp,
        ingangsdatum timestamp,
        kad_gemeente_code varchar2(255 char),
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        perceel_indexletter varchar2(255 char),
        perceel_indexnummer number(10,0),
        perceelnummer number(10,0),
        sectie varchar2(255 char),
        volgnummer_marktgegeven number(10,0),
        primary key (id)
    );

    create table stuftax_60 (
        id number(19,0) not null,
        anummer_nat_persoon number(19,0),
        aand_eigenaar_gebruiker varchar2(255 char),
        aanvulling_sofinummer number(19,0),
        cs_code varchar2(255 char),
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        sofinummer number(19,0),
        subjectnummer_akr number(19,0),
        woz_objectnummer number(19,0),
        zakelijk_recht_code varchar2(255 char),
        primary key (id)
    );

    create table stuftax_80 (
        id number(19,0) not null,
        anummer_nat_persoon number(19,0),
        aanvulling_sofinummer number(19,0),
        code_status_beschikking number(10,0),
        datum_status timestamp,
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        sofinummer number(19,0),
        waarde_peildatum timestamp,
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stuftax_91 (
        id number(19,0) not null,
        code varchar2(255 char),
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        omschrijving varchar2(255 char),
        verkorte_omschrijving varchar2(255 char),
        primary key (id)
    );

    create table stuftax_92 (
        id number(19,0) not null,
        code varchar2(255 char),
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        omschrijving varchar2(255 char),
        verkorte_omschrijving varchar2(255 char),
        primary key (id)
    );

    create table stuftax_totalen (
        id number(19,0) not null,
        aantal_10 number(10,0),
        aantal_20 number(10,0),
        aantal_21 number(10,0),
        aantal_22 number(10,0),
        aantal_23 number(10,0),
        aantal_24 number(10,0),
        aantal_25 number(10,0),
        aantal_30 number(10,0),
        aantal_31 number(10,0),
        aantal_35 number(10,0),
        aantal_40 number(10,0),
        aantal_41 number(10,0),
        aantal_51 number(10,0),
        aantal_52 number(10,0),
        aantal_53 number(10,0),
        aantal_54 number(10,0),
        aantal_60 number(10,0),
        aantal_80 number(10,0),
        aantal_90 number(10,0),
        aantal_91 number(10,0),
        aantal_92 number(10,0),
        inleesdatum timestamp,
        line_number number(10,0),
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

    create sequence stuftax_35_id_seq;

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

    create sequence stuftax_totalen_id_seq;
