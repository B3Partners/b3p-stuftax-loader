
    drop table stuftax_00 cascade;

    drop table stuftax_20 cascade;

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

    drop table stuftax_totalen cascade;

    create table stuftax_00 (
        id  bigserial not null,
        aanmaak_datum_bestand timestamp,
        aard_levering_bestand varchar(255),
        bijgewerkt_tm_maand int4,
        contactpersoon varchar(255),
        cp_telefoonnummer varchar(255),
        datum_vorig_aanl_bestand timestamp,
        gemeente_code int4,
        gemeente_naam varchar(255),
        line_number int4,
        software_leverancier varchar(255),
        versie_stuftax int4,
        primary key (id)
    );

    create table stuftax_20 (
        id  bigserial not null,
        aandeel_getaxeerd_waarde_geb int4,
        aand_huisnummer varchar(255),
        aand_valutasoort varchar(255),
        bijz_waardering_code int4,
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
        vastgesteld_waarde int4,
        waarde_peildatum timestamp,
        woonplaats varchar(255),
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_21 (
        id  bigserial not null,
        aantekening varchar(255),
        aanwezig_lift varchar(255),
        buurtcode int4,
        code_omzetbelasting varchar(255),
        code_ontbreken_nuts varchar(255),
        einddatum timestamp,
        financieringvorm varchar(255),
        foto_indexnummer int4,
        waarderingvoorschrift varchar(255),
        getaxeerd_waarde int4,
        aand_groep_vergelijkb_object varchar(255),
        heffing_maatstaf_onr_gebr int4,
        indicatie_ligging varchar(255),
        ingangsdatum timestamp,
        inpandige_opname varchar(255),
        line_number int4,
        aand_monument varchar(255),
        mutatiecode varchar(255),
        percentage_gereed int4,
        reden_waardeverschil_vast_onr varchar(255),
        soort_object_code varchar(255),
        stijlletter varchar(255),
        taxateur varchar(255),
        taxatiedatum timestamp,
        toestand_peildatum timestamp,
        type_aanduiding varchar(255),
        waarde_onr_zaakbelasting int4,
        wijkcode int4,
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_22 (
        id  bigserial not null,
        aantal_kamers int4,
        aantal_stuk_eenheden int4,
        aantekening_onderdeel varchar(255),
        bepaald_waarde_onderdeel int4,
        bouwjaar varchar(255),
        bouwlaag int4,
        breedte int4,
        code_bruto_netto_inhoud varchar(255),
        code_bruto_netto_oppervlakte varchar(255),
        code_omzetbelasting varchar(255),
        code_onderdeel_wozobject varchar(255),
        code_taxatie_methode varchar(255),
        code_vrijstelling_ozb varchar(255),
        doelmatigheid varchar(255),
        einddatum timestamp,
        factor_func_veroudering int4,
        factor_techn_veroudering int4,
        foto_indexnummer int4,
        front_breedte int4,
        waarderingvoorschrift varchar(255),
        aand_groep_vergelijkb_object varchar(255),
        hoogte int4,
        huurwaarde int4,
        huurwaarde_per_m2 int4,
        ingangsdatum timestamp,
        inhoud int4,
        invloed_doelmatigheid int4,
        invloed_eco_veroudering int4,
        invloed_excess_gebruikkost int4,
        invloed_bouwwijze_verandering int4,
        kapitalisatiefactor int4,
        kwaliteit_luxe varchar(255),
        lengte int4,
        line_number int4,
        mutatiecode varchar(255),
        nummer_onderdeel int4,
        onderhoudtoestand varchar(255),
        ongecorrigeerd_vervangwaarde int4,
        ontsluiting_verdieping varchar(255),
        oppervlakte int4,
        jaar_renovatie int4,
        percentage_renovatie int4,
        restwaarde int4,
        uitstraling varchar(255),
        kosten_vervanging_m3_stuk int4,
        verwachte_levensduur int4,
        voorzieningen varchar(255),
        waarde_per_stuk_eenheid int4,
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_23 (
        id  bigserial not null,
        einddatum timestamp,
        aand_groep_vergelijkb_obj varchar(255),
        indic_vermelding_taxatieversl varchar(255),
        ingangsdatum timestamp,
        line_number int4,
        mutatiecode varchar(255),
        volgnummer_marktgegeven int4,
        woz_objectnummer_ref int8,
        primary key (id)
    );

    create table stuftax_24 (
        id  bigserial not null,
        aand_valutasoort varchar(255),
        einddatum timestamp,
        gemachtigde varchar(255),
        indiener_bezwaarschrift varchar(255),
        ingangsdatum timestamp,
        line_number int4,
        mutatiecode varchar(255),
        nummer_bezwaarschrift varchar(255),
        nummer_bouwvergunning varchar(255),
        omschrijving_vergunning varchar(255),
        opgegeven_kosten_verbouwing int8,
        reden_tussentijd_taxatie varchar(255),
        resultaat_tussentijd_taxatie varchar(255),
        valutakosten_verbouwing varchar(255),
        volgnummer_tussentijd_taxatie int4,
        waarde_peildatum timestamp,
        waardeverandering_mutatie int4,
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_25 (
        id  bigserial not null,
        aantekening varchar(255),
        datum_controle timestamp,
        einddatum timestamp,
        gecontroleerd_object_kenm int4,
        gecontroleerd_onderdelen int4,
        identific_uitvoerder varchar(255),
        ingangsdatum timestamp,
        line_number int4,
        methodiek_controle int4,
        mutatiecode varchar(255),
        reden_controle int4,
        taxateur varchar(255),
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_30 (
        id  bigserial not null,
        anummer_nat_persoon int8,
        aand_naamgebruik varchar(255),
        aanvulling_sofinummer int4,
        geslacht_bedrijfnaam varchar(255),
        line_number int4,
        partner_bedrijfnaam_verkort varchar(255),
        sofinummer int8,
        voorletters varchar(255),
        voorvoegsels varchar(255),
        voorvoegsel_partner varchar(255),
        primary key (id)
    );

    create table stuftax_31 (
        id  bigserial not null,
        aand_huisnummer varchar(255),
        aanvulling_sofinummer int8,
        adelijke_titel_predikaat varchar(255),
        einddatum timestamp,
        functie_adres varchar(255),
        geb_datum_nat_persoon timestamp,
        geslacht varchar(255),
        handelsregisternummer int8,
        huisletter varchar(255),
        huisnummer int4,
        huisnummer_toev varchar(255),
        ingangsdatum timestamp,
        land varchar(255),
        line_number int4,
        lokatieomschrijving varchar(255),
        mutatiecode varchar(255),
        overlijden_datum_nat_persoon timestamp,
        postcode varchar(255),
        sofinummer int8,
        status_subject varchar(255),
        straatnaam varchar(255),
        subjectnummer_akr int8,
        woonplaats varchar(255),
        primary key (id)
    );

    create table stuftax_35 (
        id  bigserial not null,
        aand_huisnummer varchar(255),
        einddatum timestamp,
        huisletter varchar(255),
        huisnummer int4,
        huisnummer_toev varchar(255),
        ingangsdatum timestamp,
        line_number int4,
        lokatieomschrijving varchar(255),
        mutatiecode varchar(255),
        postcode varchar(255),
        straatnaam varchar(255),
        straatcode int4,
        woonplaats varchar(255),
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_40 (
        id  bigserial not null,
        einddatum timestamp,
        ingangsdatum timestamp,
        kad_gemeente_code varchar(255),
        line_number int4,
        meegetaxeerd_opp_geb int4,
        mutatiecode varchar(255),
        perceel_indexletter varchar(255),
        perceel_indexnummer int4,
        perceelnummer int4,
        sectie varchar(255),
        toegekend_oppervlakte int4,
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_41 (
        id  bigserial not null,
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number int4,
        mutatiecode varchar(255),
        woz_objectnummer int8,
        woz_objectnummer_sluimer int8,
        primary key (id)
    );

    create table stuftax_51 (
        id  bigserial not null,
        bebouwingcode int4,
        einddatum timestamp,
        ingangsdatum timestamp,
        kaartblad_nummer int4,
        kaartblad_volgnummer int4,
        kad_gemeente_code varchar(255),
        kadaster_oppervlakte int4,
        line_number int4,
        mutatiecode varchar(255),
        perceel_indexletter varchar(255),
        perceel_indexnummer int4,
        perceelnummer int4,
        registercode varchar(255),
        ruitletter varchar(255),
        ruitnummer int4,
        sectie varchar(255),
        stuknummer varchar(255),
        x_coord int4,
        y_coord int4,
        primary key (id)
    );

    create table stuftax_52 (
        id  bigserial not null,
        aand_bruikb_marktgegeven varchar(255),
        aand_valutasoort varchar(255),
        aard_marktinfo varchar(255),
        datum_transactie timestamp,
        einddatum timestamp,
        geschat_huurprijs_m2_peildatum int4,
        grondkosten int4,
        gronduitgifteprijs_m2 int4,
        huurprijs_m2_primair int4,
        indexatie_huurpijs varchar(255),
        indic_omzetbel_grondprijs varchar(255),
        indic_omzetbel_huurprijs varchar(255),
        ingangsdatum timestamp,
        kosten_afbouw_inr int4,
        kosten_infra int4,
        kosten_installatie int4,
        kosten_overig int4,
        kosten_ruwbouw int4,
        kosten_werktuigen int4,
        line_number int4,
        looptijd_huurcontract int4,
        mutatiecode varchar(255),
        omschrijving_transactie varchar(255),
        servicekosten int4,
        soort_transactie varchar(255),
        totaal_brutoinhoud_obj int4,
        totaal_bruto_vloer_opp int4,
        totaal_opp_grond int4,
        txprijs int4,
        txprijs_idx_waarde_peildatum int4,
        verhuurb_vloer_opp_primair int4,
        volgnummer_marktgegeven int4,
        primary key (id)
    );

    create table stuftax_53 (
        id  bigserial not null,
        einddatum timestamp,
        foto_indexnummer int4,
        ingangsdatum timestamp,
        koopdatum timestamp,
        kwant_fout_oude_waarde int4,
        kwant_gevolg_wijz_wozobject int4,
        kwant_verschil_verkprijs_markt int4,
        line_number int4,
        mutatiecode varchar(255),
        reden_afwijk_marktgeg_wozverw int4,
        relevantie_afwijking int4,
        waarde_vastgest_datum_marktg int8,
        wijz_verw_waarde_vastgesteld int4,
        volgnummer_marktgegeven int4,
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_54 (
        id  bigserial not null,
        einddatum timestamp,
        ingangsdatum timestamp,
        kad_gemeente_code varchar(255),
        line_number int4,
        mutatiecode varchar(255),
        perceel_indexletter varchar(255),
        perceel_indexnummer int4,
        perceelnummer int4,
        sectie varchar(255),
        volgnummer_marktgegeven int4,
        primary key (id)
    );

    create table stuftax_60 (
        id  bigserial not null,
        anummer_nat_persoon int8,
        aand_eigenaar_gebruiker varchar(255),
        aanvulling_sofinummer int8,
        cs_code varchar(255),
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number int4,
        mutatiecode varchar(255),
        sofinummer int8,
        subjectnummer_akr int8,
        woz_objectnummer int8,
        zakelijk_recht_code varchar(255),
        primary key (id)
    );

    create table stuftax_80 (
        id  bigserial not null,
        anummer_nat_persoon int8,
        aanvulling_sofinummer int8,
        code_status_beschikking int4,
        datum_status timestamp,
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number int4,
        mutatiecode varchar(255),
        sofinummer int8,
        waarde_peildatum timestamp,
        woz_objectnummer int8,
        primary key (id)
    );

    create table stuftax_91 (
        id  bigserial not null,
        code varchar(255),
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number int4,
        mutatiecode varchar(255),
        omschrijving varchar(255),
        verkorte_omschrijving varchar(255),
        primary key (id)
    );

    create table stuftax_92 (
        id  bigserial not null,
        code varchar(255),
        einddatum timestamp,
        ingangsdatum timestamp,
        line_number int4,
        mutatiecode varchar(255),
        omschrijving varchar(255),
        verkorte_omschrijving varchar(255),
        primary key (id)
    );

    create table stuftax_totalen (
        id  bigserial not null,
        aantal_10 int4,
        aantal_20 int4,
        aantal_21 int4,
        aantal_22 int4,
        aantal_23 int4,
        aantal_24 int4,
        aantal_25 int4,
        aantal_30 int4,
        aantal_31 int4,
        aantal_35 int4,
        aantal_40 int4,
        aantal_41 int4,
        aantal_51 int4,
        aantal_52 int4,
        aantal_53 int4,
        aantal_54 int4,
        aantal_60 int4,
        aantal_80 int4,
        aantal_90 int4,
        aantal_91 int4,
        aantal_92 int4,
        inleesdatum timestamp,
        line_number int4,
        primary key (id)
    );
