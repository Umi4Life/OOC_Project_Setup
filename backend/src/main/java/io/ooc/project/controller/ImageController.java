package io.ooc.project.Controller;

import io.ooc.project.Model.*;
import io.ooc.project.Service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/myImage")
public class ImageController {

	@Autowired
	private CategoryServiceTest categoryService;

	@Autowired
	private ItemServiceTest itemService;
	
	private final int DEFAULT_BUFFER_SIZE = 10240;
	
	@RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
	  public void showImage(@RequestParam("id") Integer itemId, HttpServletResponse response, HttpServletRequest request)
			  throws ServletException, IOException{
		
		System.out.println(itemId);
		Item item = itemService.get(itemId);
		System.out.println(itemId);
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		
		//String yourBase64EncodedBytesString = new String(Base64.encodeBase64(content));
		//System.out.println(new String(item.getItemImage()));
		
		response.getOutputStream().write(item.getItemImage());
		
		System.out.println("Image is");
	
		response.getOutputStream().close();
		/*
		byte[] encoded=Base64.encodeBase64(item.getItemImage());
		String encodedString = new String(encoded);
		request.setAttribute("image", encodedString);
		ModelMap map = new ModelMap();
		map.put("image", encodedString);
		*/
	
	}
	

}
