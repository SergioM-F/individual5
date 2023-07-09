package cl.samf.individual5;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cl.samf.individual5.databinding.ItemBinding;

public class AdaptersWords extends RecyclerView.Adapter<AdaptersWords.ViewHolder> {
        private List<String> words;
        public void setData(List<String> data) {
        this.words = data;
     }
    public void addwords(String newItem) {
        words.add(newItem);

        //notifyItemInserted(words.size() - 1);
    }

    @NonNull
    @Override
    public AdaptersWords.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptersWords.ViewHolder holder, int position) {
        String item = words.get(position);
        holder.mostrarInfo(item);
    }

    @Override
    public int getItemCount() {
         return words.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemBinding itemBinding;
        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            this.itemBinding = binding;
        }
        public void mostrarInfo(String words) {
            itemBinding.textView2.setText(words);
        }
    }
}
