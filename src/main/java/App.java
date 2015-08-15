//import java.util.Random;
//import java.util.Arrays;
//import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {

    String layout = "templates/layout.vtl";

      get("/", (request, response) -> {
              HashMap model = new HashMap();
              model.put("template", "templates/userdata.vtl");
              return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());


        get("/detector", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            model.put("template", "templates/result.vtl");

            String userInput = request.queryParams("userInput");
            String userOutput = replaceVowelsInWord(userInput);


          model.put("userOutput", userOutput);


            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());


  }


    public static String replaceVowelsInWord(String wordInput) {


      String convertedString = wordInput.replaceAll("[aeiouAEIOU]", "-");


      return convertedString;

    }
}


  //     int lengthOfInputWord  = wordInput.length();
  //      String dash = "-";
  //
  //
  //      char[] c = new char[str.length()];
  //       for (int i = 0; i < str.length(); i++) {
  //
  //           if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o'
  //                   || c[i] == 'u') {
  //
  //               System.out.println(str.replace(c[i], '?'));
  //

  //
  //      for(int count = 0; count <= wordInput.length(); count ++)
  //      {
  //          char checkLetter = wordInput.charAt(count);
  //          if(checkLetter == 'a' || checkLetter == 'A' || checkLetter == 'e' || checkLetter == 'E' || checkLetter == 'i' || checkLetter == 'I' || checkLetter == 'o' || checkLetter == 'O'
  //          || checkLetter == 'u' || checkLetter == 'U')
  //          {
  //           String front = word.substring(0, count);
  //           String back = word.substring(count + 1);
  //           word = front + "*" + back;
  //          }
  //      }
