package com.aspose.asposecloudpdf.examples.images;

import com.aspose.asposecloudpdf.ApiException;
import com.aspose.asposecloudpdf.api.PdfApi;
import com.aspose.asposecloudpdf.examples.Common;
import com.aspose.asposecloudpdf.model.AsposeResponse;
import com.aspose.asposecloudpdf.model.ImagesResponse;

public class DeleteImageExample {

	public static void main(String[] args) throws ApiException {
		String name = "PdfWithImages2.pdf";
		PdfApi pdfApi = new PdfApi("XXXXXXXXXXX", "XXXXXXX");
		Common.uploadFile(pdfApi, name);
		int pageNumber = 1;
        String folder = "";
        ImagesResponse imagesResponse = pdfApi.getImages(name, pageNumber, null, folder);
        String imageId = imagesResponse.getImages().getList().get(0).getId();
        AsposeResponse response = pdfApi.deleteImage(name, imageId, null, folder);
		System.out.println(response.getCode());

	}
}
