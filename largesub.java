System.out.println("longest sub string "+longestString("java2Novice"));

System.out.println("longest sub string "+longestString("java_language_is_sweet"));

System.out.println("longest sub string "+longestString("java_java_java_java"));

}

public static String longestString(String data){

String longestSubStr="";

for(int i=0;i<data.length();i++){ string="" substr="" ;="" for(int="" j="i;j&lt;data.length();j++){" if((substr.indexof(data.charat(j)))="=-1){" substr="subStr+data.charAt(j);" }="" else{="" break;="" }="" if(substr.length()="">longestSubStr.length()){

longestSubStr=subStr;

}

}

}

return longestSubStr;

}

}