package p1_p3;

public class GStack<G extends Object> {
		private G[] stackArray;
		private int top;
		private int maxSize;

		public GStack(int maxSize) {
			this.maxSize = maxSize;
			top = -1;
			stackArray = (G[]) new Object[maxSize];
		}

		public boolean isEmpty() {
			return top == -1;
		}

		public boolean isFull() {
			return top == maxSize - 1;
		}

		public G peek() {
			return stackArray[top];
		}

		public void push(G g) {
			stackArray[++top] = g;
		}

		public G pop() {
			return stackArray[top--];
		}

		//2
		public void pushAll(G[] g) {
			for(int i=0; i<g.length; i++) {
				if(isFull()) {
					break;
				}
				else {
					push(g[i]);
				}
			}
		}
		
		//3
		public G[] popAll() {
			if(isEmpty()) { 
				return null;
			}
			G[] temp= (G[]) new Object[maxSize];
			for(int i=0; i< maxSize; i++) {
				if(isEmpty()) { 
					return temp;
				}
				temp[i]=pop();
			}
			return temp;
		}
	}
