public class Box {

	int l, w, h;

	public Box(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	public int getLength() { return l; }
	public int getWidth() { return w; }
	public int getHeight() { return h; }

	public int[] getDimensions() { return new int[] { l, w, h }; }
}

