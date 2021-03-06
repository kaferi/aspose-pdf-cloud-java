package com.aspose.asposecloudpdf.examples.annotations;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.SquareAnnotationsResponse;

public class GetPageSquaresAnnotationsTest {

	public static void main(String[] args) throws ApiException {
		int pageNumber = 2;
		String name = "PdfWithAnnotations.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "78946fb4-3bd4-4d3e-b309-f9e2ff9ac6f9");

		Common.uploadFile(pdfApi, name);
		SquareAnnotationsResponse response = pdfApi.getPageSquareAnnotations(name, pageNumber, null, "");
		System.out.println(response.getCode());

	}

}
