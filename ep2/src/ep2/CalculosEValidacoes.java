package ep2;

import java.text.DecimalFormat;

public class CalculosEValidacoes {
	private float fatorPot;
	
	
	public boolean validaAmpTen(String amp) {
		float fAmp = Float.valueOf(amp);
		if(fAmp >= 0 || fAmp <= 220) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validaAmpCor(String amp) {
		float fAmp = Float.valueOf(amp);
		if(fAmp >= 0 || fAmp <= 100) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validaAng(String ang) {
		float fAng = Float.valueOf(ang);
		if(fAng >= -180 || fAng <= 180) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean validaOrdemHarm(String ordem) {
		float fOrdem = Float.valueOf(ordem);
		if(fOrdem >= 0 || fOrdem <= 15) {
			return true;
		}
		else {
			return false;
		}
	}
	public String calculaPotAtiva(String ampTen,String ampCor,String angTen, String angCor) {
		float fAmpTen = Float.valueOf(ampTen);
		float fAmpCor = Float.valueOf(ampCor);
		float fAngTen = Float.valueOf(angTen);
		float fAngCor = Float.valueOf(angCor);
		double total = fAmpTen*fAmpCor*(Math.cos(fAngTen-fAngCor));
		DecimalFormat df = new DecimalFormat("0.00");
		return String.valueOf(df.format(total));
	}
	public String calculaPotReativa(String ampTen,String ampCor,String angTen, String angCor) {
		float fAmpTen = Float.valueOf(ampTen);
		float fAmpCor = Float.valueOf(ampCor);
		float fAngTen = Float.valueOf(angTen);
		float fAngCor = Float.valueOf(angCor);
		double total = fAmpTen*fAmpCor*(Math.sin(fAngTen-fAngCor));
		DecimalFormat df = new DecimalFormat("0.00");
		return String.valueOf(df.format(total));
	}
	public String calculaPotAparente(String ampTen,String ampCor) {
		float fAmpTen = Float.valueOf(ampTen);
		float fAmpCor = Float.valueOf(ampCor);
		double total = fAmpTen*fAmpCor;
		DecimalFormat df = new DecimalFormat("0.00");	
		return String.valueOf(df.format(total));
	}
	public String calculaFatPot(String angTen, String angCor) {
		float fAngTen = Float.valueOf(angTen);
		float fAngCor = Float.valueOf(angCor);
		double total = (Math.cos(fAngTen-fAngCor));
		String complemento = "";
		if(fAngTen-fAngCor < 0) {
			complemento = "adiantado ";
		}
		else if(fAngTen-fAngCor > 0) {
			complemento = "atrasado ";
		}
		DecimalFormat df = new DecimalFormat("0.00");
		return String.join(" ",complemento,String.valueOf(df.format(total)));
	}
	public String calculaPotDist(String ordem,String angTen,String angCor,String ampCor, String ampTen) {
		return "";
	}
	public String fatorPotTrue() {
		return "";
	}
}
