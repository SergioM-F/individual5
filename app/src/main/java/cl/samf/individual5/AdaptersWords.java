package cl.samf.individual5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.samf.individual5.databinding.ItemBinding;

public class AdaptersWords extends RecyclerView.Adapter<AdaptersWords.ViewHolder> {
        private List<String> words;
    @NonNull
    @Override
    public AdaptersWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate((LayoutInflater.from(parent.getContext())));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptersWords.ViewHolder holder, int position) {
        String item = words.get(position);
    }

    @Override
    public int getItemCount() {
         return words.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding ItemBinding;
        public ViewHolder(@NonNull ItemBinding binding) {
            super(binding.getRoot());
            ItemBinding = binding;
        }
        public void mostrarInfo(String words) {
            ItemBinding.textView2.setText(words);
        }
    }
}
