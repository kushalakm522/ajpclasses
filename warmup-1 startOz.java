public String startOz(String str) {
  return (str.startsWith("o") ? "o" : "") + ((str.length() > 1 && str.charAt(1) == 'z') ? "z" : "");
}
