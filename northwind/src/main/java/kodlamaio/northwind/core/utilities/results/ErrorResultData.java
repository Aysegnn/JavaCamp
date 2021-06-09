package kodlamaio.northwind.core.utilities.results;

public class ErrorResultData<T> extends DataResult<T>{

	public ErrorResultData(T data,String message) {
		super(data,false,message);
		
	}
	
	public ErrorResultData(T data) {
		super(data,false);
		
	}
	
	public ErrorResultData(String message) {
		super(null,false,message);
		
	}
	
	public ErrorResultData() {
		super(null,false);
		
	}

}
