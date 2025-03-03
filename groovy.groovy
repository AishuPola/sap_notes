import com.sap.gateway.ip.core.customdev.util.Message;
 def Message processData (Message message) {
 
def body = message.getBody(java.lang.String);
def messageLog = messageLogFactory-getMessageLog(message);
 
if(messageLog != null) {
messageLog.setStringProperty("log1", "Printing Payload As Attachment") messageLog.addAttachmentAsString("log1", body, "text/plain"); }
return message;
}