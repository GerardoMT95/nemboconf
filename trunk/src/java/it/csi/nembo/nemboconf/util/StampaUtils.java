package TOBECONFIG.nembo.nemboconf.util;

import java.util.HashMap;
import java.util.Map;

import TOBECONFIG.nembo.nemboconf.util.stampa.AmmissioneFinanziamento;
import TOBECONFIG.nembo.nemboconf.util.stampa.AmmissioneFinanziamentoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.AmmissioneFinanziamentoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.ComunicazioneEsitoIstruttoriaMisureAPremioNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.ComunicazioneEsitoIstruttoriaMisureAPremioParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.ComunicazioneEsitoIstruttoriaMisureAPremioPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.ComunicazioneProvvedimentoFinale;
import TOBECONFIG.nembo.nemboconf.util.stampa.LetteraIntegPagamento;
import TOBECONFIG.nembo.nemboconf.util.stampa.Pratica;
import TOBECONFIG.nembo.nemboconf.util.stampa.PreavvisoDiRigettoParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.PreavvisoDiRigettoTotale;
import TOBECONFIG.nembo.nemboconf.util.stampa.Stampa;
import TOBECONFIG.nembo.nemboconf.util.stampa.VerbaleIntegPagamento;
import TOBECONFIG.nembo.nemboconf.util.stampa.VerbaleIstruttoriaDomandaSostegno;
import TOBECONFIG.nembo.nemboconf.util.stampa.VerbaleIstruttoriaDomandaSostegnoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.VerbaleIstruttoriaDomandaSostegnoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.VerbaleIstruttoriaMisureAPremioNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.VerbaleIstruttoriaMisureAPremioParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.VerbaleIstruttoriaMisureAPremioPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.acconto.LetteraIstruttoriaAccontoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.acconto.LetteraIstruttoriaAccontoParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.acconto.LetteraIstruttoriaAccontoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.acconto.LetteraIstruttoriaAccontoPreavvisoRigetto;
import TOBECONFIG.nembo.nemboconf.util.stampa.acconto.VerbaleIstruttoriaAccontoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.acconto.VerbaleIstruttoriaAccontoParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.acconto.VerbaleIstruttoriaAccontoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.annullamento.LetteraAnnullamentoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.annullamento.LetteraAnnullamentoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.anticipo.LetteraIstruttoriaAnticipoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.anticipo.LetteraIstruttoriaAnticipoParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.anticipo.LetteraIstruttoriaAnticipoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.anticipo.LetteraIstruttoriaAnticipoPreavvisoRigetto;
import TOBECONFIG.nembo.nemboconf.util.stampa.anticipo.VerbaleIstruttoriaAnticipoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.anticipo.VerbaleIstruttoriaAnticipoParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.anticipo.VerbaleIstruttoriaAnticipoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.LetteraPostIstruttoriaPremio;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.LetteraPostIstruttoriaPremioNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.LetteraPostIstruttoriaPremioParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.LetteraPostIstruttoriaPremioPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.VerbalePostIstruttoriaPremio;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.VerbalePostIstruttoriaPremioNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.VerbalePostIstruttoriaPremioParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.misurepremio.postistruttoria.VerbalePostIstruttoriaPremioPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.proroga.LetteraProrogaNegativa;
import TOBECONFIG.nembo.nemboconf.util.stampa.proroga.LetteraProrogaPositiva;
import TOBECONFIG.nembo.nemboconf.util.stampa.proroga.VerbaleProrogaNegativa;
import TOBECONFIG.nembo.nemboconf.util.stampa.proroga.VerbaleProrogaPositiva;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.LetteraRevoca;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.LetteraRevocaNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.LetteraRevocaNegativo2;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.LetteraRevocaParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.LetteraRevocaPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.VerbalePreavvisoRevocaPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.VerbaleRevoca;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.VerbaleRevocaNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.revoca.VerbaleRevocaPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.saldo.LetteraIstruttoriaSaldoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.saldo.LetteraIstruttoriaSaldoParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.saldo.LetteraIstruttoriaSaldoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.saldo.LetteraIstruttoriaSaldoPreavvisoRigetto;
import TOBECONFIG.nembo.nemboconf.util.stampa.saldo.VerbaleIstruttoriaSaldoNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.saldo.VerbaleIstruttoriaSaldoParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.saldo.VerbaleIstruttoriaSaldoPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.voltura.LetteraVolturaNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.voltura.LetteraVolturaParziale;
import TOBECONFIG.nembo.nemboconf.util.stampa.voltura.LetteraVolturaPositivo;
import TOBECONFIG.nembo.nemboconf.util.stampa.voltura.VerbaleVolturaNegativo;
import TOBECONFIG.nembo.nemboconf.util.stampa.voltura.VerbaleVolturaPositivo;

/**
 * Classe astratta per le funzioni di utilit� sulle stringhe. La classe �
 * abstract perch� non deve essere usata direttamente ma solo dalla sua
 * implementazione nella costante Utils.STRING
 * 
 */
public abstract class StampaUtils
{
  public static Map<String, Stampa> MAP_STAMPE = new HashMap<String, Stampa>();
  static
  {
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.PRATICA_Nemboconf,
        new Pratica());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO,
        new AmmissioneFinanziamento());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO,
        new VerbaleIstruttoriaDomandaSostegno());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_POSITIVO_1,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_POSITIVO_1,
        new AmmissioneFinanziamentoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_POSITIVO_2,
        new AmmissioneFinanziamentoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_NEGATIVO_1,
        new PreavvisoDiRigettoTotale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_NEGATIVO_2,
        new AmmissioneFinanziamentoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_PARZIALE_1,
        new PreavvisoDiRigettoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_PARZIALE_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_PARZIALE_2,
        new AmmissioneFinanziamentoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_AMMISSIONE_FINANZIAMENTO_PARZIALE_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_POSITIVO_1,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_POSITIVO_2,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_NEGATIVO_1,
        new VerbaleIstruttoriaDomandaSostegnoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_NEGATIVO_2,
        new VerbaleIstruttoriaDomandaSostegnoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_PARZIALE_1,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_PARZIALE_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_PARZIALE_2,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_SOSTEGNO_PARZIALE_2));
    // misure a premio
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_ESITO_ISTRUTTORIA_MISURE_A_PREMIO_POSITIVO_1,
        new ComunicazioneEsitoIstruttoriaMisureAPremioPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_ESITO_ISTRUTTORIA_MISURE_A_PREMIO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_ESITO_ISTRUTTORIA_MISURE_A_PREMIO_NEGATIVO_1,
        new ComunicazioneEsitoIstruttoriaMisureAPremioNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_ESITO_ISTRUTTORIA_MISURE_A_PREMIO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_ESITO_ISTRUTTORIA_MISURE_A_PREMIO_PARZIALE_1,
        new ComunicazioneEsitoIstruttoriaMisureAPremioParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_ESITO_ISTRUTTORIA_MISURE_A_PREMIO_PARZIALE_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_MISURE_A_PREMIO_POSITIVO_1,
        new VerbaleIstruttoriaMisureAPremioPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_MISURE_A_PREMIO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_MISURE_A_PREMIO_NEGATIVO_1,
        new VerbaleIstruttoriaMisureAPremioNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_MISURE_A_PREMIO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_MISURE_A_PREMIO_PARZIALE_1,
        new VerbaleIstruttoriaMisureAPremioParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_MISURE_A_PREMIO_PARZIALE_1));

    // MAP_STAMPE.put(NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO,
    // new VerbaleIstruttoriaAcconto());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_POSITIVO_1,
        new VerbaleIstruttoriaAccontoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_NEGATIVO_1,
        new VerbaleIstruttoriaAccontoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_POSITIVO_2,
        new VerbaleIstruttoriaAccontoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_NEGATIVO_2,
        new VerbaleIstruttoriaAccontoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_PARZIALE_1,
        new VerbaleIstruttoriaAccontoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ACCONTO_PARZIALE_1));

    // MAP_STAMPE.put(NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO,
    // new VerbaleIstruttoriaAnticipo());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_POSITIVO_1,
        new VerbaleIstruttoriaAnticipoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_NEGATIVO_1,
        new VerbaleIstruttoriaAnticipoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_POSITIVO_2,
        new VerbaleIstruttoriaAnticipoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_NEGATIVO_2,
        new VerbaleIstruttoriaAnticipoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_PARZIALE_1,
        new VerbaleIstruttoriaAnticipoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_ANTICIPO_PARZIALE_1));

    // MAP_STAMPE.put(NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO,
    // new VerbaleIstruttoriaSaldo());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_POSITIVO_1,
        new VerbaleIstruttoriaSaldoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_NEGATIVO_1,
        new VerbaleIstruttoriaSaldoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_POSITIVO_2,
        new VerbaleIstruttoriaSaldoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_NEGATIVO_2,
        new VerbaleIstruttoriaSaldoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_PARZIALE_1,
        new VerbaleIstruttoriaSaldoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_SALDO_PARZIALE_1));

    // MAP_STAMPE.put(NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO,
    // new LetteraIstruttoriaAcconto());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_POSITIVO_1,
        new LetteraIstruttoriaAccontoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_NEGATIVO_1,
        new LetteraIstruttoriaAccontoPreavvisoRigetto(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_POSITIVO_2,
        new LetteraIstruttoriaAccontoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_NEGATIVO_2,
        new LetteraIstruttoriaAccontoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_PARZIALE_1,
        new LetteraIstruttoriaAccontoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ACCONTO_PARZIALE_1));

    // MAP_STAMPE.put(NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO,
    // new LetteraIstruttoriaAnticipo());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_POSITIVO_1,
        new LetteraIstruttoriaAnticipoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_NEGATIVO_1,
        new LetteraIstruttoriaAnticipoPreavvisoRigetto(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_POSITIVO_2,
        new LetteraIstruttoriaAnticipoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_NEGATIVO_2,
        new LetteraIstruttoriaAnticipoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_PARZIALE_1,
        new LetteraIstruttoriaAnticipoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_ANTICIPO_PARZIALE_1));

    // MAP_STAMPE.put(NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO,
    // new LetteraIstruttoriaSaldo());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_POSITIVO_1,
        new LetteraIstruttoriaSaldoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_NEGATIVO_1,
        new LetteraIstruttoriaSaldoPreavvisoRigetto(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_POSITIVO_2,
        new LetteraIstruttoriaSaldoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_NEGATIVO_2,
        new LetteraIstruttoriaSaldoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_PARZIALE_1,
        new LetteraIstruttoriaSaldoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ISTRUTTORIA_SALDO_PARZIALE_1));

    /* STAMPE VARIANTE */
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE,
        new AmmissioneFinanziamento());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_POSITIVO_1,
        new AmmissioneFinanziamentoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_POSITIVO_2,
        new AmmissioneFinanziamentoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_NEGATIVO_1,
        new PreavvisoDiRigettoTotale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_NEGATIVO_2,
        new AmmissioneFinanziamentoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_PARZIALE_1,
        new PreavvisoDiRigettoParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_PARZIALE_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_PARZIALE_2,
        new AmmissioneFinanziamentoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VARIANTE_PARZIALE_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE,
        new VerbaleIstruttoriaDomandaSostegno());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_POSITIVO_1,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_POSITIVO_2,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_NEGATIVO_1,
        new VerbaleIstruttoriaDomandaSostegnoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_NEGATIVO_2,
        new VerbaleIstruttoriaDomandaSostegnoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_NEGATIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_PARZIALE_1,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_PARZIALE_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_PARZIALE_2,
        new VerbaleIstruttoriaDomandaSostegnoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_ISTRUTTORIA_DOMANDA_VARIANTE_PARZIALE_2));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_PROVVEDIMENTO_FINALE,
        new ComunicazioneProvvedimentoFinale());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_INTEG_PAGAMENTO,
        new VerbaleIntegPagamento());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_INTEG_PAGAMENTO,
        new LetteraIntegPagamento());

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_POST_ISTRUTTORIA_MISURE_PREMIO,
        new VerbalePostIstruttoriaPremio());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_POST_ISTRUTTORIA_MISURE_PREMIO_POSITIVO,
        new VerbalePostIstruttoriaPremioPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_POST_ISTRUTTORIA_MISURE_PREMIO_POSITIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_POST_ISTRUTTORIA_MISURE_PREMIO_PARZIALE,
        new VerbalePostIstruttoriaPremioParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_POST_ISTRUTTORIA_MISURE_PREMIO_PARZIALE));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_POST_ISTRUTTORIA_MISURE_PREMIO_NEGATIVO,
        new VerbalePostIstruttoriaPremioNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_POST_ISTRUTTORIA_MISURE_PREMIO_NEGATIVO));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_POST_ISTRUTTORIA_MISURE_PREMIO,
        new LetteraPostIstruttoriaPremio());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_POST_ISTRUTTORIA_MISURE_PREMIO_POSITIVO_1,
        new LetteraPostIstruttoriaPremioPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_POST_ISTRUTTORIA_MISURE_PREMIO_POSITIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_POST_ISTRUTTORIA_MISURE_PREMIO_NEGATIVO_1,
        new LetteraPostIstruttoriaPremioNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_POST_ISTRUTTORIA_MISURE_PREMIO_NEGATIVO_1));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_POST_ISTRUTTORIA_MISURE_PREMIO_PARZIALE_1,
        new LetteraPostIstruttoriaPremioParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_POST_ISTRUTTORIA_MISURE_PREMIO_PARZIALE_1));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_COMUNICAZIONE_PROVVEDIMENTO_FINALE,
        new ComunicazioneProvvedimentoFinale());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_INTEG_PAGAMENTO,
        new VerbaleIntegPagamento());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_INTEG_PAGAMENTO,
        new LetteraIntegPagamento());

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_PROROGA,
        new VerbaleProrogaPositiva());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_PROROGA_POSITIVO,
        new VerbaleProrogaPositiva(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_PROROGA_POSITIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_PROROGA_NEGATIVO,
        new VerbaleProrogaNegativa(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_PROROGA_NEGATIVO));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_PROROGA,
        new LetteraProrogaPositiva());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_PROROGA_POSITIVO,
        new LetteraProrogaPositiva(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_PROROGA_POSITIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_PROROGA_NEGATIVO,
        new LetteraProrogaNegativa(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_PROROGA_NEGATIVO));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_REVOCA,
        new LetteraRevoca());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_PREAVVISO_REVOCA,
        new LetteraRevocaParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_PREAVVISO_REVOCA));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_REVOCA_DEFINITIVA,
        new LetteraRevocaPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_REVOCA_DEFINITIVA));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_REVOCA_NEGATIVA,
        new LetteraRevocaNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_REVOCA_NEGATIVA));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_REVOCA_NEGATIVA_2,
        new LetteraRevocaNegativo2(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_REVOCA_NEGATIVA));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_POSITIVO,
        new LetteraVolturaPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_POSITIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_POSITIVO_2,
        new LetteraVolturaPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_NEGATIVO,
        new LetteraVolturaNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_NEGATIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_PREAVVISO_RIGETTO,
        new LetteraVolturaParziale(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_VOLTURA_PREAVVISO_RIGETTO));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_POSITIVO,
        new VerbaleVolturaPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_POSITIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_POSITIVO_2,
        new VerbaleVolturaPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_NEGATIVO,
        new VerbaleVolturaNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_NEGATIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_NEGATIVO_2,
        new VerbaleVolturaNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_VOLTURA_NEGATIVO_2));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ANNULLAMENTO_POSITIVO,
        new LetteraAnnullamentoPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ANNULLAMENTO_POSITIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ANNULLAMENTO_NEGATIVO,
        new LetteraAnnullamentoNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_LETTERA_ANNULLAMENTO_NEGATIVO));

    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_REVOCA,
        new VerbaleRevoca());
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_REVOCA_POSITIVO,
        new VerbalePreavvisoRevocaPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_REVOCA_POSITIVO));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_REVOCA_POSITIVO_2,
        new VerbaleRevocaPositivo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_REVOCA_POSITIVO_2));
    MAP_STAMPE.put(
        NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_REVOCA_NEGATIVO,
        new VerbaleRevocaNegativo(
            NemboConstants.USECASE.STAMPA.CRUSCOTTO_BANDI.GENERA_VERBALE_REVOCA_NEGATIVO));

  }

  public Stampa getStampaFromCdU(String cuName)
  {
    return MAP_STAMPE.get(cuName);
  }

}
