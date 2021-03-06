
package com.game_machine.entity_system.generated;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.ByteString;
import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;

import java.io.ByteArrayOutputStream;
import com.dyuproject.protostuff.JsonIOUtil;
import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.game_machine.entity_system.generated.Entity;

import com.dyuproject.protostuff.Pipe;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class Transform  implements Externalizable, Message<Transform>, Schema<Transform>
{




    public static Schema<Transform> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static Transform getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final Transform DEFAULT_INSTANCE = new Transform();



    public Vector3 vector3;



    public Quaternion quaternion;


    


    public Transform()
    {
        
    }






    

	public Vector3 getVector3() {
		return vector3;
	}
	
	public Transform setVector3(Vector3 vector3) {
		this.vector3 = vector3;
		return this;
	}
	
	public Boolean hasVector3()  {
        return vector3 == null ? false : true;
    }



    

	public Quaternion getQuaternion() {
		return quaternion;
	}
	
	public Transform setQuaternion(Quaternion quaternion) {
		this.quaternion = quaternion;
		return this;
	}
	
	public Boolean hasQuaternion()  {
        return quaternion == null ? false : true;
    }



  
    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<Transform> cachedSchema()
    {
        return DEFAULT_INSTANCE;
    }

    // schema methods

    public Transform newMessage()
    {
        return new Transform();
    }

    public Class<Transform> typeClass()
    {
        return Transform.class;
    }

    public String messageName()
    {
        return Transform.class.getSimpleName();
    }

    public String messageFullName()
    {
        return Transform.class.getName();
    }

    public boolean isInitialized(Transform message)
    {
        return true;
    }

    public void mergeFrom(Input input, Transform message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;

            	case 1:


                	message.vector3 = input.mergeObject(message.vector3, Vector3.getSchema());
                    break;

                	


            	case 2:


                	message.quaternion = input.mergeObject(message.quaternion, Quaternion.getSchema());
                    break;

                	


            
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, Transform message) throws IOException
    {

    	

    	


    	if(message.vector3 != null)
    		output.writeObject(1, message.vector3, Vector3.getSchema(), false);

    	


    	

    	


    	if(message.quaternion != null)
    		output.writeObject(2, message.quaternion, Quaternion.getSchema(), false);

    	


    	
    }

    public String getFieldName(int number)
    {
        switch(number)
        {

        	case 1: return "vector3";

        	case 2: return "quaternion";

            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        final Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {

    	__fieldMap.put("vector3", 1);

    	__fieldMap.put("quaternion", 2);

    }
   
   public static List<String> getFields() {
	ArrayList<String> fieldNames = new ArrayList<String>();
	String fieldName = null;
	Integer i = 1;
	
    while(true) { 
		fieldName = Transform.getSchema().getFieldName(i);
		if (fieldName == null) {
			break;
		}
		fieldNames.add(fieldName);
		i++;
	}
	return fieldNames;
}

public static Transform parseFrom(byte[] bytes) {
	Transform message = new Transform();
	ProtobufIOUtil.mergeFrom(bytes, message, RuntimeSchema.getSchema(Transform.class));
	return message;
}

public Transform clone() {
	byte[] bytes = this.toByteArray();
	Transform transform = Transform.parseFrom(bytes);
	return transform;
}
	
public byte[] toByteArray() {
	return toProtobuf();
	//return toJson();
}

public byte[] toJson() {
	boolean numeric = false;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
		JsonIOUtil.writeTo(out, this, Transform.getSchema(), numeric);
	} catch (IOException e) {
		e.printStackTrace();
		throw new RuntimeException("Json encoding failed");
	}
	return out.toByteArray();
}
		
public byte[] toProtobuf() {
	LinkedBuffer buffer = LinkedBuffer.allocate(8024);
	byte[] bytes = null;

	try {
		bytes = ProtobufIOUtil.toByteArray(this, RuntimeSchema.getSchema(Transform.class), buffer);
		buffer.clear();
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException("Protobuf encoding failed");
	}
	return bytes;
}

}
