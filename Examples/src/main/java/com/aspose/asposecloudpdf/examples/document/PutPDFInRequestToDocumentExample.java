package com.aspose.asposecloudpdf.examples.document;

import java.io.File;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.model.AsposeResponse;

public class PutPDFInRequestToDocumentExample {

	public static void main(String[] args) throws ApiException {
		String name = "4pages.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");

		File file = new File("testData" + "/" + name);
		String resFileName = "result.doc";

		AsposeResponse response = pdfApi.putPdfInRequestToDoc("" + '/' + resFileName, null, null, null, null, null,
				null, null, null, null, file);

	}

}
