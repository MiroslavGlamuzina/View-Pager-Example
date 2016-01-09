package remington.productions.viewpager;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("RtlHardcoded")
public class Fragment_Example_Three extends Fragment implements OnClickListener {
	TextView tv;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment, container, false);
		//Notice that 'rootView' is used in place of 'this'
		tv = (TextView) rootView.findViewById(R.id.tv);
		tv.setText("Fragment Example 3");
		tv.setOnClickListener(this);
		return rootView;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.tv:
			//Notice that 'getContext()' is used in place of 'this'
			Toast.makeText(getContext(), "Fragment 3", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
	}

	@Override
	public void onStart() {
		super.onStart();

	}

	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
		super.setUserVisibleHint(isVisibleToUser);

	}

}
