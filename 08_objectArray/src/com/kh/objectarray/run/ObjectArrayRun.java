package com.kh.objectarray.run;
import com.kh.objectarray.model.service.BookService;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		BookService service = new BookService();
		//service.serchBookV1();
		service.serchBookV2();
	}
}
