package in.com.raystec.IOStream;

import java.io.Serializable;

public class TransientAttributes implements Serializable {
	//attributes
		private String name = null;
		private int maths = 0;
		private int physics = 0;
		private int chemistry = 0;
		private transient String id = null;
		
		//constructor
		public TransientAttributes() {
			// TODO Auto-generated constructor stub
		}
		
		//getter/setter

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMaths() {
			return maths;
		}

		public void setMaths(int maths) {
			this.maths = maths;
		}

		public int getPhysics() {
			return physics;
		}

		public void setPhysics(int physics) {
			this.physics = physics;
		}

		public int getChemistry() {
			return chemistry;
		}

		public void setChemistry(int chemistry) {
			this.chemistry = chemistry;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		
		
		
}

