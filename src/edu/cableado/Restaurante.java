package edu.cableado;

import edu.utilitario.Cargador;
import inv.logica.*;
public class Restaurante {

	public static void main(String[] args) {
		
		
		Cargador cf = new Cargador("front",ClassLoader.getSystemClassLoader());
		Cargador cb = new Cargador("back",ClassLoader.getSystemClassLoader());
        Class clsf,clsb;
		
        try {
		
			clsb = cb.cargarUnaClaseDesdeSuDirectorio(IGestionInventarios.class.getName());
			if (clsb != null) {
				IGestionInventarios ia = (IGestionInventarios)clsb.getConstructor().newInstance();
				ia.gestionarInventario();
			}
		}catch (Exception e) {e.printStackTrace();}
        
        
        try {
    		
			clsb = cb.cargarUnaClaseDesdeSuDirectorio(IGestionAlimentos.class.getName());
			if (clsb != null) {
				IGestionAlimentos ig =(IGestionAlimentos)clsb.getConstructor().newInstance();
				ig.actualizarAlimentos();
			}
		}catch (Exception e) {e.printStackTrace();}
        
        try {
			
			clsf = cf.cargarUnaClaseDesdeSuDirectorio(IPedidos.class.getName());
			if (clsf != null) {
				IPedidos ir = (IPedidos)clsf.getConstructor().newInstance();
				ir.hacerPedido();
				
			}
		} catch (Exception e) {e.printStackTrace();}
        
try {
			
			clsf = cf.cargarUnaClaseDesdeSuDirectorio(IPagos.class.getName());
			if (clsf != null) {
				IPagos ip = (IPagos)clsf.getConstructor().newInstance();
				ip.capturarPago();
				ip.guardarPago();
				
			}
		} catch (Exception e) {e.printStackTrace();}
      
	}

	}

