
    drop table stax_code_onderdeel cascade constraints;

    drop table stax_code_soortobject cascade constraints;

    drop table stax_controle_objecten cascade constraints;

    drop table stax_eigenaar_gebruiker cascade constraints;

    drop table stax_extra_adres cascade constraints;

    drop table stax_identif_marktinfo cascade constraints;

    drop table stax_kadaster_identif cascade constraints;

    drop table stax_kadaster_object cascade constraints;

    drop table stax_marktinfo cascade constraints;

    drop table stax_marktinfo_kadaster cascade constraints;

    drop table stax_marktinfo_woz cascade constraints;

    drop table stax_onderbouw_onderd cascade constraints;

    drop table stax_onderbouwing cascade constraints;

    drop table stax_sluimer_woz cascade constraints;

    drop table stax_status_beschikking cascade constraints;

    drop table stax_subject_30 cascade constraints;

    drop table stax_subject_31 cascade constraints;

    drop table stax_tussentijd_taxatie cascade constraints;

    drop table stax_voorloop cascade constraints;

    drop table stax_wozobject cascade constraints;

    drop sequence stax_code_onderdeel_id_seq;

    drop sequence stax_code_soortobject_id_seq;

    drop sequence stax_controle_objecten_id_seq;

    drop sequence stax_eigenaar_gebruiker_id_seq;

    drop sequence stax_extra_adres_id_seq;

    drop sequence stax_identif_marktinfo_id_seq;

    drop sequence stax_kadaster_identif_id_seq;

    drop sequence stax_kadaster_object_id_seq;

    drop sequence stax_marktinfo_id_seq;

    drop sequence stax_marktinfo_kadaster_id_seq;

    drop sequence stax_marktinfo_woz_id_seq;

    drop sequence stax_onderbouw_onderd_id_seq;

    drop sequence stax_onderbouwing_id_seq;

    drop sequence stax_sluimer_woz_id_seq;

    drop sequence stax_status_beschikking_id_seq;

    drop sequence stax_subject_30_id_seq;

    drop sequence stax_subject_31_id_seq;

    drop sequence stax_tussentijd_taxatie_id_seq;

    drop sequence stax_voorloop_id_seq;

    drop sequence stax_wozobject_id_seq;

    create table stax_code_onderdeel (
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

    create table stax_code_soortobject (
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

    create table stax_controle_objecten (
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

    create table stax_eigenaar_gebruiker (
        id number(19,0) not null,
        anummer_nat_persoon number(19,0),
        aand_eigenaar_gebruiker varchar2(255 char),
        aanvulling_sofinummer number(10,0),
        cs_code varchar2(255 char),
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        sofinummer number(10,0),
        subjectnummer_akr number(19,0),
        woz_objectnummer number(19,0),
        zakelijk_recht_code varchar2(255 char),
        primary key (id)
    );

    create table stax_extra_adres (
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

    create table stax_identif_marktinfo (
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

    create table stax_kadaster_identif (
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

    create table stax_kadaster_object (
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

    create table stax_marktinfo (
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

    create table stax_marktinfo_kadaster (
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

    create table stax_marktinfo_woz (
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

    create table stax_onderbouw_onderd (
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

    create table stax_onderbouwing (
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

    create table stax_sluimer_woz (
        id number(19,0) not null,
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        woz_objectnummer number(19,0),
        woz_objectnummer_sluimer number(19,0),
        primary key (id)
    );

    create table stax_status_beschikking (
        id number(19,0) not null,
        anummer_nat_persoon number(19,0),
        aanvulling_sofinummer number(10,0),
        code_status_beschikking number(10,0),
        datum_status timestamp,
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number number(10,0),
        mutatiecode varchar2(255 char),
        sofinummer number(10,0),
        waarde_peildatum timestamp,
        woz_objectnummer number(19,0),
        primary key (id)
    );

    create table stax_subject_30 (
        id number(19,0) not null,
        anummer_nat_persoon number(10,0),
        aand_naamgebruik varchar2(255 char),
        aanvulling_sofinummer number(10,0),
        geslacht_bedrijfnaam varchar2(255 char),
        line_number number(10,0),
        partner_bedrijfnaam_verkort varchar2(255 char),
        sofinummer number(10,0),
        voorletters varchar2(255 char),
        voorvoegsels varchar2(255 char),
        voorvoegsel_partner varchar2(255 char),
        primary key (id)
    );

    create table stax_subject_31 (
        id number(19,0) not null,
        aand_huisnummer varchar2(255 char),
        aanvulling_sofinummer number(10,0),
        adelijke_titel_predikaat varchar2(255 char),
        einddatum timestamp,
        functie_adres varchar2(255 char),
        geb_datum_nat_persoon timestamp,
        geslacht varchar2(255 char),
        handelsregisternummer number(10,0),
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
        sofinummer number(10,0),
        status_subject varchar2(255 char),
        straatnaam varchar2(255 char),
        subjectnummer_akr number(10,0),
        woonplaats varchar2(255 char),
        primary key (id)
    );

    create table stax_tussentijd_taxatie (
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

    create table stax_voorloop (
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

    create table stax_wozobject (
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

    create sequence stax_code_onderdeel_id_seq;

    create sequence stax_code_soortobject_id_seq;

    create sequence stax_controle_objecten_id_seq;

    create sequence stax_eigenaar_gebruiker_id_seq;

    create sequence stax_extra_adres_id_seq;

    create sequence stax_identif_marktinfo_id_seq;

    create sequence stax_kadaster_identif_id_seq;

    create sequence stax_kadaster_object_id_seq;

    create sequence stax_marktinfo_id_seq;

    create sequence stax_marktinfo_kadaster_id_seq;

    create sequence stax_marktinfo_woz_id_seq;

    create sequence stax_onderbouw_onderd_id_seq;

    create sequence stax_onderbouwing_id_seq;

    create sequence stax_sluimer_woz_id_seq;

    create sequence stax_status_beschikking_id_seq;

    create sequence stax_subject_30_id_seq;

    create sequence stax_subject_31_id_seq;

    create sequence stax_tussentijd_taxatie_id_seq;

    create sequence stax_voorloop_id_seq;

    create sequence stax_wozobject_id_seq;
