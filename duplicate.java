String s = "geeksforgeeks";

System.out.println(removeDuplicate(s));
}

private static String removeDuplicate(String s) {
Set<character> charSet = new HashSet<>();
StringBuilder sb = new StringBuilder();

for(char ch : s.toCharArray()){
boolean isInserted = charSet.add(ch);
if(isInserted)
sb.append(ch);
}

return sb.toString();
}