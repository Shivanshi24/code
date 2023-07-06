package com.rays.io;

import java.io.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	public int id;
	public String name;
	public String address;
	public int salary;

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = (int) in.readObject();
		name = (String) in.readObject();
		address = (String) in.readObject();
		salary = (int) in.readObject();

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(name);
		out.writeObject(address);
		out.writeObject(salary);

	}

}
