// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.2_01, build R40)
// Generated source version: 1.1.2

package org.egso.comms.pis.wsdl;

import javax.xml.namespace.QName;
import javax.xml.rpc.encoding.Deserializer;
import javax.xml.rpc.encoding.Serializer;
import javax.xml.rpc.encoding.TypeMapping;
import javax.xml.rpc.encoding.TypeMappingRegistry;

import com.sun.xml.rpc.client.BasicService;
import com.sun.xml.rpc.encoding.CombinedSerializer;
import com.sun.xml.rpc.encoding.SerializerConstants;
import com.sun.xml.rpc.encoding.SingletonDeserializerFactory;
import com.sun.xml.rpc.encoding.SingletonSerializerFactory;
import com.sun.xml.rpc.encoding.literal.LiteralFragmentSerializer;
import com.sun.xml.rpc.encoding.literal.LiteralSimpleTypeSerializer;
import com.sun.xml.rpc.encoding.simpletype.XSDAnyURIEncoder;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;

public class PIS_Service_SerializerRegistry implements SerializerConstants {
    public PIS_Service_SerializerRegistry() {
    }
    
    public TypeMappingRegistry getRegistry() {
        
        TypeMappingRegistry registry = BasicService.createStandardTypeMappingRegistry();
        TypeMapping mapping12 = registry.getTypeMapping(SOAP12Constants.NS_SOAP_ENCODING);
        TypeMapping mapping = registry.getTypeMapping(SOAPConstants.NS_SOAP_ENCODING);
        TypeMapping mapping2 = registry.getTypeMapping("");
        {
            CombinedSerializer serializer = new LiteralFragmentSerializer(SchemaConstants.QNAME_TYPE_URTYPE, NOT_NULLABLE, "");
            registerSerializer(mapping2,javax.xml.soap.SOAPElement.class, SchemaConstants.QNAME_TYPE_URTYPE, serializer);
        }
        {
            QName type = new QName("urn:org.egso.comms/nds/types/", "Application");
            CombinedSerializer serializer = new org.egso.comms.nds.types.Application_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,org.egso.comms.nds.types.Application.class, type, serializer);
        }
        {
            CombinedSerializer serializer = new LiteralSimpleTypeSerializer(SchemaConstants.QNAME_TYPE_ANY_URI,
                "", XSDAnyURIEncoder.getInstance());
            registerSerializer(mapping2,java.net.URI.class, SchemaConstants.QNAME_TYPE_ANY_URI, serializer);
        }
        {
            QName type = new QName("urn:org.egso.comms/pis/types/", "Header");
            CombinedSerializer serializer = new org.egso.comms.pis.types.Header_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,org.egso.comms.pis.types.Header.class, type, serializer);
        }
        {
            QName type = new QName("urn:org.egso.comms/nds/types/", "ApplicationList");
            CombinedSerializer serializer = new org.egso.comms.nds.types.ApplicationList_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,org.egso.comms.nds.types.ApplicationList.class, type, serializer);
        }
        {
            QName type = new QName("urn:org.egso.comms/nds/types/", "PISList");
            CombinedSerializer serializer = new org.egso.comms.nds.types.PISList_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,org.egso.comms.nds.types.PISList.class, type, serializer);
        }
        {
            QName type = new QName("urn:org.egso.comms/nds/types/", "PIS");
            CombinedSerializer serializer = new org.egso.comms.nds.types.PIS_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,org.egso.comms.nds.types.PIS.class, type, serializer);
        }
        {
            QName type = new QName("urn:org.egso.comms/pis/types/", "Message");
            CombinedSerializer serializer = new org.egso.comms.pis.types.Message_LiteralSerializer(type, "", DONT_ENCODE_TYPE);
            registerSerializer(mapping2,org.egso.comms.pis.types.Message.class, type, serializer);
        }
        return registry;
    }
    
    private static void registerSerializer(TypeMapping mapping, Class javaType, QName xmlType,
        Serializer ser) {
        mapping.register(javaType, xmlType, new SingletonSerializerFactory(ser),
            new SingletonDeserializerFactory((Deserializer)ser));
    }
    
}
