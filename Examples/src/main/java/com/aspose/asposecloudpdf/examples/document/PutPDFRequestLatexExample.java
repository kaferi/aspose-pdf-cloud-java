package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPDFRequestLatexExample {

	public static void main(String[] args) throws ApiException {
		String name = "4pages.pdf";
        File file = new File("testData" + "/" + name);
        String resFileName = "result.latex";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

        AsposeResponse response = pdfApi.putPdfInRequestToLaTeX("" + '/' + resFileName, null, null, file);

	}

}
