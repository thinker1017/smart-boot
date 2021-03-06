package net.vinote.smartboot.shared;

import org.apache.logging.log4j.Level;

/**
 * 统一异常类
 * 
 * @author Seer
 * @version DbApiException.java, v 0.1 2016年1月26日 下午4:01:51 Seer Exp. 
 */
public class SmartException extends RuntimeException {
	/** */
	private static final long serialVersionUID = 1L;
	private int code = 1;
	private Level level;

	public SmartException(int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public SmartException(String message) {
		super(message);
	}

	public SmartException(Level level, String message) {
		super(message);
		this.level = level;
	}

	public SmartException(Throwable cause) {
		super(cause);
	}

	public SmartException(int code, String message) {
		super(message);
		this.code = code;
	}

	/**
	 * Getter method for property <tt>code</tt>.
	 *
	 * @return property value of code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Getter method for property <tt>level</tt>.
	 *
	 * @return property value of level
	 */
	public final Level getLevel() {
		return level;
	}

}
