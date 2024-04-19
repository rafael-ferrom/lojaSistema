package CrudLoja.Application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class arquivoSistema {

	public static boolean gravarObjeto(Object obj, String caminho) {

		File arquivo = new File(caminho);

		if (!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} // try
			catch (Exception e) {
				e.printStackTrace();
				return false;
			} // catch
		} // if

		try {
			FileOutputStream fileOutput = new FileOutputStream(arquivo);
			ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);

			objOutput.writeObject(obj);

			objOutput.flush();
			fileOutput.flush();

			objOutput.close();
			fileOutput.close();

			return true;
		} // try
		catch (Exception e) {
			e.printStackTrace();
			return false;
		} // catch

	}// gravarObjeto

	public static Object recuperarObjeto(Object obj, String caminho) {

		File arquivo = new File(caminho);

		if (!arquivo.exists()) {
			try {
				arquivoSistema.gravarObjeto(obj, caminho);
			} // try
			catch (Exception e) {
				e.printStackTrace();
			} // catch
			return obj;
		} // if
		else {
			try {
				FileInputStream fileInput = new FileInputStream(arquivo);
				ObjectInputStream objInput = new ObjectInputStream(fileInput);

				Object retorno = objInput.readObject();

				objInput.close();
				fileInput.close();

				return retorno;

			} // try
			catch (Exception e) {
				e.printStackTrace();
				return null;
			} // catch
		} // else
	}// recuperarObjeto

	public static int getMonth(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		return Integer.parseInt(sdf.format(date));
	}//getmonth
	

}// arquivoSistema