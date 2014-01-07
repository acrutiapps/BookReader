package net.nightwhistler.pageturner.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import net.sf.andpdf.pdfviewer.PdfViewerActivity;
import com.acrutiapps.books.R;
import com.joanzapata.pdfview.PDFView;

import java.io.File;

/**
 * Created by aksharprabhudesai on 1/3/14.
 */
public class PDFReaderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdflayout);
        try{
        PDFView pView = (PDFView) findViewById(R.id.pdfview);
        Bundle extras = getIntent().getExtras();
        String pdfName = extras.getString("PDF");
        Log.i("debug-log",pdfName);
        pView.fromFile(new File(Uri.parse(pdfName).toString())).load();

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
