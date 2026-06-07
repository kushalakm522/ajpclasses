public boolean stringE(String str) {
  return str.length() - str.replace("e", "").length() >= 1 && str.length() - str.replace("e", "").length() <= 3;
}
