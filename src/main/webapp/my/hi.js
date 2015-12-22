function update() {
  var name = dwr.util.getValue("myName");
  SayHi.getHi(name, loadinfo);
}

function loadinfo(data) {
    dwr.util.setValue("getHi", data);
}