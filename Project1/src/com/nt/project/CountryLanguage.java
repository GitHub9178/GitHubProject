package com.nt.project;

import java.util.Locale;

public class CountryLanguage {
	Locale l[]=null;
 public void country(){
   l=Locale.getAvailableLocales();
   for(Locale locales:l) {
	   System.out.println("country are::"+locales.getCountry()+"...."+locales.getLanguage());
   }
   //hiii123
   //hiii321
 }
}
