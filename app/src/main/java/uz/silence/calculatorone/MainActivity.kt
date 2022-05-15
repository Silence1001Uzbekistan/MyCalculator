package uz.silence.calculatorone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder
import uz.silence.calculatorone.databinding.ActivityMainBinding
import java.math.BigDecimal

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn0.setOnClickListener(this)
        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)

        binding.btnAnswer.setOnClickListener(this)
        binding.btnClear.setOnClickListener(this)
        binding.btnClose.setOnClickListener(this)
        binding.btnMinus.setOnClickListener(this)
        binding.btnOpen.setOnClickListener(this)
        binding.btnPlus.setOnClickListener(this)
        binding.btnRemove.setOnClickListener(this)
        binding.btnSlash.setOnClickListener(this)
        binding.btnX.setOnClickListener(this)
        binding.btnPoint.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {

        val id = p0?.id

        when (id) {

            R.id.btn_0 -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "0"
                ) {
                    emptyAdd()
                    binding.tvAnswer.append("0")
                }
            }

            R.id.btn_1 -> {
                emptyAdd()
                binding.tvAnswer.append("1")
            }

            R.id.btn_2 -> {
                emptyAdd()
                binding.tvAnswer.append("2")
            }

            R.id.btn_3 -> {
                emptyAdd()
                binding.tvAnswer.append("3")
            }

            R.id.btn_4 -> {
                emptyAdd()
                binding.tvAnswer.append("4")
            }

            R.id.btn_5 -> {
                emptyAdd()
                binding.tvAnswer.append("5")
            }

            R.id.btn_6 -> {
                emptyAdd()
                binding.tvAnswer.append("6")
            }

            R.id.btn_7 -> {
                emptyAdd()
                binding.tvAnswer.append("7")
            }

            R.id.btn_8 -> {
                emptyAdd()
                binding.tvAnswer.append("8")
            }

            R.id.btn_9 -> {
                emptyAdd()
                binding.tvAnswer.append("9")
            }

            R.id.btn_close -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    emptyAdd()
                    binding.tvAnswer.append(")")
                }
            }


            R.id.btn_minus -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    emptyAdd()
                    binding.tvAnswer.append("-")
                }
            }

            R.id.btn_plus -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    emptyAdd()
                    binding.tvAnswer.append("+")
                }
            }

            R.id.btn_open -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    emptyAdd()
                    binding.tvAnswer.append("(")
                }
            }

            R.id.btn_slash -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    emptyAdd()
                    binding.tvAnswer.append("/")
                }
            }

            R.id.btn_x -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    emptyAdd()
                    binding.tvAnswer.append("*")
                }

            }

            R.id.btn_point -> {
                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    binding.tvAnswer.append(".")
                }

            }


            R.id.btn_answer -> {

                //Toast.makeText(this, binding.tvAnswer.text.substring(binding.tvAnswer.text.length-1,binding.tvAnswer.length()), Toast.LENGTH_SHORT).show()

                if (binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "." && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "(" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != ")" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "*" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "-" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "+" && binding.tvAnswer.text.substring(
                        binding.tvAnswer.text.length - 1,
                        binding.tvAnswer.text.length
                    ) != "/"
                ) {
                    var build = ExpressionBuilder(binding.tvAnswer.text.toString()).build()
                    binding.tvAnswer.text = BigDecimal(build.evaluate()).toString()
                } else {
                    Toast.makeText(this, "Bajarilmadi", Toast.LENGTH_SHORT).show()
                }

            }

            R.id.btn_clear -> {
                binding.tvAnswer.text = "0"

            }


            R.id.btn_remove -> {
                if (binding.tvAnswer.text != "0" && binding.tvAnswer.text.isNotEmpty() && binding.tvAnswer.text.length != 1) {
                    val text = binding.tvAnswer.text
                    binding.tvAnswer.text =
                        binding.tvAnswer.text.subSequence(0, binding.tvAnswer.text.length - 1)
                } else {
                    if(binding.tvAnswer.text.length == 1){
                        binding.tvAnswer.text = "0"
                    }
                }

            }

        }

    }

    private fun emptyAdd() {

        val text = binding.tvAnswer.text.toString()

        if (text == "0") {
            binding.tvAnswer.text = ""
        }

    }
}