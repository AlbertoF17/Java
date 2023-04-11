package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Movimiento;
import Practicas.PokemonAlbertoFernandez.tipos.*;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;

public abstract class Pokemon implements Tipo {
    String mote;
    int pokedexNum;
    int tipo1;
    int tipo2;
    int psBase;
    int ataqueBase;
    int defensaBase;
    int atqEspecialBase;
    int defEspecialBase;
    int velocidadBase;
    int nivel;
    int psMax;
    int ps;
    int ataque;
    int defensa;
    int atqEspecial;
    int defEspecial;
    int velocidad;
    Movimiento[] movimientos;
    float[] debilidades;

    public Pokemon() {
        this.mote = "MissingNo.";
        this.movimientos = new Movimiento[4];
        this.debilidades = new float[tipos.length];
    }

    public Pokemon(String mote, int pokedexNum, int tipo1, int tipo2, int psBase, int ataqueBase, int defensaBase,
                   int atqEspecialBase, int defEspecialBase, int velocidadBase, int nivel) {
        this.mote = mote;
        this.pokedexNum = pokedexNum;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.psBase = psBase;
        this.ataqueBase = ataqueBase;
        this.defensaBase = defensaBase;
        this.atqEspecialBase = atqEspecialBase;
        this.defEspecialBase = defEspecialBase;
        this.velocidadBase = velocidadBase;
        this.nivel = nivel-1;
        subirDeNivel();
        movimientos = new Movimiento[4];
        this.debilidades = calcularDebilidades();
    }

    public String getMote() {
        return mote;
    }

    public int getPokedexNum() {
        return pokedexNum;
    }

    public int getTipo1() {
        return tipo1;
    }

    public int getTipo2() {
        return tipo2;
    }

    public int getPsBase() {
        return psBase;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public int getDefensaBase() {
        return defensaBase;
    }

    public int getAtqEspecialBase() {
        return atqEspecialBase;
    }

    public int getDefEspecialBase() {
        return defEspecialBase;
    }

    public int getVelocidadBase() {
        return velocidadBase;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPsMax() {
        return psMax;
    }

    public int getPs() {
        return ps;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtqEspecial() {
        return atqEspecial;
    }

    public int getDefEspecial() {
        return defEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public float[] getDebilidades() {
        return debilidades;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setPsMax(int psMax) {
        this.psMax = psMax;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAtqEspecial(int atqEspecial) {
        this.atqEspecial = atqEspecial;
    }

    public void setDefEspecial(int defEspecial) {
        this.defEspecial = defEspecial;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "mote='" + mote + '\'' +
                ", pokedexNum=" + pokedexNum +
                ", tipo1=" + tipos[tipo1] +
                ", tipo2=" + tipos[tipo2] +
                ", psBase=" + psBase +
                ", ataqueBase=" + ataqueBase +
                ", defensaBase=" + defensaBase +
                ", atqEspecialBase=" + atqEspecialBase +
                ", defEspecialBase=" + defEspecialBase +
                ", velocidadBase=" + velocidadBase +
                ", nivel=" + nivel +
                ", psMax=" + psMax +
                ", ps=" + ps +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", atqEspecial=" + atqEspecial +
                ", defEspecial=" + defEspecial +
                ", velocidad=" + velocidad +
                ", movimientos=" + Arrays.toString(movimientos) +
                ", debilidades=" + Arrays.toString(debilidades) +
                '}';
    }

    public void curar(){
        ps = psMax;
    }

    public abstract Pokemon evolucionar() throws OperationNotSupportedException;

    private float[] calcularDebilidades(){
        float[] deb = new float[tipos.length];
        if(tipo2 == -1){
            deb[0] = TipoAcero.efectividad[tipo1];
            deb[1] = TipoAgua.efectividad[tipo1];
            deb[2] = TipoBicho.efectividad[tipo1];
            deb[3] = TipoDragon.efectividad[tipo1];
            deb[4] = TipoElectrico.efectividad[tipo1];
            deb[5] = TipoFantasma.efectividad[tipo1];
            deb[6] = TipoFuego.efectividad[tipo1];
            deb[7] = TipoHada.efectividad[tipo1];
            deb[8] = TipoHielo.efectividad[tipo1];
            deb[9] = TipoLucha.efectividad[tipo1];
            deb[10] = TipoNormal.efectividad[tipo1];
            deb[11] = TipoPlanta.efectividad[tipo1];
            deb[12] = TipoPsiquico.efectividad[tipo1];
            deb[13] = TipoRoca.efectividad[tipo1];
            deb[14] = TipoSiniestro.efectividad[tipo1];
            deb[15] = TipoTierra.efectividad[tipo1];
            deb[16] = TipoVeneno.efectividad[tipo1];
            deb[17] = TipoVolador.efectividad[tipo1];
        } else {
            deb[0] = TipoAcero.efectividad[tipo1]*TipoAcero.efectividad[tipo2];
            deb[1] = TipoAgua.efectividad[tipo1]*TipoAgua.efectividad[tipo2];
            deb[2] = TipoBicho.efectividad[tipo1]*TipoBicho.efectividad[tipo2];
            deb[3] = TipoDragon.efectividad[tipo1]*TipoDragon.efectividad[tipo2];
            deb[4] = TipoElectrico.efectividad[tipo1]*TipoElectrico.efectividad[tipo2];
            deb[5] = TipoFantasma.efectividad[tipo1]*TipoFantasma.efectividad[tipo2];
            deb[6] = TipoFuego.efectividad[tipo1]*TipoFuego.efectividad[tipo2];
            deb[7] = TipoHada.efectividad[tipo1]*TipoHada.efectividad[tipo2];
            deb[8] = TipoHielo.efectividad[tipo1]*TipoHielo.efectividad[tipo2];
            deb[9] = TipoLucha.efectividad[tipo1]*TipoLucha.efectividad[tipo2];
            deb[10] = TipoNormal.efectividad[tipo1]*TipoNormal.efectividad[tipo2];
            deb[11] = TipoPlanta.efectividad[tipo1]*TipoPlanta.efectividad[tipo2];
            deb[12] = TipoPsiquico.efectividad[tipo1]*TipoPsiquico.efectividad[tipo2];
            deb[13] = TipoRoca.efectividad[tipo1]*TipoRoca.efectividad[tipo2];
            deb[14] = TipoSiniestro.efectividad[tipo1]*TipoSiniestro.efectividad[tipo2];
            deb[15] = TipoTierra.efectividad[tipo1]*TipoTierra.efectividad[tipo2];
            deb[16] = TipoVeneno.efectividad[tipo1]*TipoVeneno.efectividad[tipo2];
            deb[17] = TipoVolador.efectividad[tipo1]*TipoVolador.efectividad[tipo2];
        }
        return deb;
    }

    public void subirDeNivel(){
        this.nivel = this.nivel+1;
        this.psMax = (((2*psBase+31)*nivel)/100)+nivel+10;
        this.ataque = (int) ((((((2*ataqueBase+31)*nivel)/100)+5)+nivel+10)*1.1f);
        this.atqEspecial = (int) ((((((2*atqEspecialBase+31)*nivel)/100)+5)+nivel+10)*1.1f);
        this.defensa = (int) ((((((2*defensaBase+31)*nivel)/100)+5)+nivel+10)*1.1f);
        this.defEspecial = (int) ((((((2*defEspecial+31)*nivel)/100)+5)+nivel+10)*1.1f);
        this.velocidad = (int) ((((((2*velocidadBase+31)*nivel)/100)+5)+nivel+10)*1.1f);
    }

    private void recibirDanho(Pokemon pok, Movimiento ataque){
        float[] deb = calcularDebilidades();
        float b;
        if (ataque.getTipo() == pok.getTipo1() || ataque.getTipo() == pok.getTipo2()){
            b = 1.5f;
        } else {
            b = 1;
        }
        float e = deb[ataque.getTipo()];
        int a, d;
        if (ataque.getClase() == 0){
            a = pok.getAtaque();
            d = defensa;
        } else {
            a = pok.getAtqEspecial();
            d = defEspecial;
        }
        int p = ataque.getPotencia();
        System.out.println(ps);
        System.out.println("Daño: " + (int) (0.01*b*e*10*((((0.2*nivel+1)*a*p)/d)+2)));
        this.ps = this.ps - (int) (0.01*b*e*10*((((0.2*nivel+1)*a*p)/d)+2));
        System.out.println(ps);
    }

    public void atacar(Pokemon objetivo, int movimiento){
        System.out.println(mote + " usó: " + movimientos[movimiento].getClass().getSimpleName());
        objetivo.recibirDanho(this, movimientos[movimiento]);
    }
}
